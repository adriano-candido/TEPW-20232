import React from 'react';
import { Link } from 'react-router-dom';

import './styles.css';
import logoImage from '../../assets/logo.png';

export default function User(){
    return (
        <div className="user-container">
            <header>
                <img src={logoImage} alt="Logo unichristus"/>>
            </header>
        </div>
    );
}