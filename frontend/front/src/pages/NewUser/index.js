import React from 'react';
import { Link } from 'react-router-dom';
import { FiArrowLeft } from 'react-icons/fi'

import './styles.css';
import logoImage from '../../assets/logo.png';

export default function NewUser(){
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
            <form>
                <input placeholder="Nome Completo" />
                <input placeholder="E-mail" />
                <input placeholder="Usuário" />
                <input type="password" placeholder="Senha" />

                <button className="button" type="submit">Salvar</button>
            </form>
        </div>
    );
}