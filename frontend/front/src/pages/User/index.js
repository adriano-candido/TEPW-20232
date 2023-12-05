import React, {useState, useEffect}  from 'react';
import { Link } from 'react-router-dom';
import {FiPower, FiEdit, FiTrash2 } from 'react-icons/fi'

import './styles.css';
import logoImage from '../../assets/logo.png';

import api from '../../services/api';

export default function User(){

    const [users, setUsers] = useState([]);

    useEffect(() => {
        api.get(`api/v1/user`).then(response => {
            setUsers(response.data);
         } )
     } )

     async function deleteUser(id){
        try{
            await api.delete(`api/v1/user/${id}`)
        }catch(err){
            alert("Falha ao deletar usuário! Tente novamente.");
        }
     }

    return (
        <div className="user-container">
            <header>
                <img src={logoImage} alt="Logo unichristus"/>>
                <span>Bem vindo, <strong>Adriano</strong>!</span>
                <Link className="button" to="/user/new">Add Novo Usuário</Link>
                <button type="button">
                    <FiPower size={18} color="#251FC5"/>
                </button>
            </header>

            <h1>Usuários Cadastrados</h1>
            <ul>
                {users.map(user => 
                <li>
                    <strong>Nome</strong>
                    <p>{user.nome}</p>
                    <strong>E-mail</strong>
                    <p>{user.email}</p>
                    <strong>Usuário</strong>
                    <p>{user.login}</p>

                        <button type="button">
                            <FiEdit size={20} color="#251FC5"/>
                        </button>
                        <button 
                        onClick={ () => deleteUser(user.id)}
                        type="button">
                            <FiTrash2 size={20} color="#251FC5"/>
                        </button>
                    
                </li>
                )}
            </ul>
        </div>
    );
}