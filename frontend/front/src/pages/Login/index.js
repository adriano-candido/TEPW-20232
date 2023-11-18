import React from 'react';
import './styles.css';

import logoImage from '../../assets/logo.png';
import padLock from '../../assets/padlock.png';

export default function Login(){
    return(
       <div className="login-container">
        <section className="form">
            <img src={logoImage}  alt="Logo Unichristus" />
            <form action="">
                <h1>Acesse sua conta</h1>
                <input placeholder="Usuário"/>
                <input type="password" placeholder="senha" />

                <button type="submit" 
                className="button">Entrar</button>
            </form>
        </section>

        <img src={padLock} alt="Imagem Cadeado Login"/>
       </div>
    );
}