import React from 'react';
import { Link } from 'react-router-dom';
import {FiPower, FiEdit, FiTrash2 } from 'react-icons/fi'

import './styles.css';
import logoImage from '../../assets/logo.png';

export default function User(){
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
                <li>
                    <strong>Nome</strong>
                    <p>João Lima</p>
                    <strong>E-mail</strong>
                    <p>joaozinho@gmail.com</p>
                    <strong>Usuário</strong>
                    <p>jao123

                        <button type="button">
                            <FiEdit size={20} color="#251FC5"/>
                        </button>
                        <button type="button">
                            <FiTrash2 size={20} color="#251FC5"/>
                        </button>
                    </p>
                </li>
                <li>
                    <strong>Nome</strong>
                    <p>João Lima</p>
                    <strong>E-mail</strong>
                    <p>joaozinho@gmail.com</p>
                    <strong>Usuário</strong>
                    <p>jao123

                        <button type="button">
                            <FiEdit size={20} color="#251FC5"/>
                        </button>
                        <button type="button">
                            <FiTrash2 size={20} color="#251FC5"/>
                        </button>
                    </p>
                </li>
                <li>
                    <strong>Nome</strong>
                    <p>João Lima</p>
                    <strong>E-mail</strong>
                    <p>joaozinho@gmail.com</p>
                    <strong>Usuário</strong>
                    <p>jao123

                        <button type="button">
                            <FiEdit size={20} color="#251FC5"/>
                        </button>
                        <button type="button">
                            <FiTrash2 size={20} color="#251FC5"/>
                        </button>
                    </p>
                </li>
                <li>
                    <strong>Nome</strong>
                    <p>João Lima</p>
                    <strong>E-mail</strong>
                    <p>joaozinho@gmail.com</p>
                    <strong>Usuário</strong>
                    <p>jao123

                        <button type="button">
                            <FiEdit size={20} color="#251FC5"/>
                        </button>
                        <button type="button">
                            <FiTrash2 size={20} color="#251FC5"/>
                        </button>
                    </p>
                </li>
            </ul>
        </div>
    );
}