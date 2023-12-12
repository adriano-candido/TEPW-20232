import React, {useState} from 'react';
import {useNavigate} from 'react-router-dom';
import './styles.css';

import api from '../../services/api';

import logoImage from '../../assets/logo.png';
import padLock from '../../assets/padlock.png';

export default function Login(){

    const [login, setLogin] = useState('');
    const [password, setPassword] = useState('');

    const navigate = useNavigate();

    async function loginUser(e){
        e.preventDefault();

        const data = {
            login,
            password,
        }

        try{
            await api.post('api/v1/user/auth/signin', data);

            localStorage.setItem('login', login);

            navigate('/user');
        }catch(err){
            alert('Credenciais inválidas! Tente novamente.');
        }

    }

    return(
       <div className="login-container">
        <section className="form">
            <img src={logoImage}  alt="Logo Unichristus" />
            <form onSubmit={loginUser}>
                <h1>Acesse sua conta</h1>
                <input 
                value={login}
                onChange={e => setLogin(e.target.value)}
                placeholder="Usuário"/>
                <input 
                value={password}
                onChange={e => setPassword(e.target.value)}
                type="password" placeholder="senha" />

                <button type="submit" 
                className="button">Entrar</button>
            </form>
        </section>

        <img src={padLock} alt="Imagem Cadeado Login"/>
       </div>
    );
}