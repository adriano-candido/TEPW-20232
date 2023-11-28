import React, {useState, useEffect} from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { FiArrowLeft } from 'react-icons/fi'

import './styles.css';
import logoImage from '../../assets/logo.png';

import api from '../../services/api';

export default function NewUser(){

    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [login, setLogin] = useState('');
    const [password, setPassword] = useState('');

    const navigate = useNavigate();

    async function createNewUser(e){
        e.preventDefault();

        const data = {
            name,
            email,
            login, 
            password,
        }

        try{
            await api.post('api/v1/user', data);
        }catch(err){
            alert('Erro ao salvar usuário! Tente novamente.');
        }

        navigate('/user');

    }

    return (
        <div className="new-user-container">
            <section className="form">
                <img src={logoImage} alt="Logo Unichristus"/>
                <h1>Adicionar novo usuário</h1>
                <p>Preencha todos os campos de usuário e clique em salvar!</p>
                <Link className="back-link" to="/user">
                    <FiArrowLeft size={18} color="#251FC5"/>
                    Home
                    </Link>>
            </section>
            <form onSubmit={createNewUser}>
                <input placeholder="Nome Completo" 
                value={name}
                onChange={e => setName(e.target.value)}
                />
                <input placeholder="E-mail" 
                value={email}
                onChange={e => setEmail(e.target.value)}
                />
                <input placeholder="Usuário" 
                value={login}
                onChange={e => setLogin(e.target.value)}
                />
                <input type="password" placeholder="Senha" 
                value={password}
                onChange={e => setPassword(e.target.value)}
                />

                <button className="button" type="submit">Salvar</button>
            </form>
        </div>
    );
}