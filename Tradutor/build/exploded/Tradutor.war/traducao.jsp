<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tradutor</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        
        .container {
            width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f0f0f0;
            border-radius: 5px;
        }
        
        h1 {
            text-align: center;
        }
        
        .form-group {
            margin-bottom: 10px;
        }
        
        .form-group label {
            display: block;
            font-weight: bold;
        }
        
        .form-group input[type="text"] {
            width: 100%;
            padding: 5px;
            font-size: 16px;
        }
        
        .form-group input[type="submit"] {
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
        }
        
        .traducao-result {
            margin-top: 20px;
            padding: 10px;
            background-color: #ebebeb;
            border-radius: 5px;
        }
        
        .traducao-result h2 {
            margin-top: 0;
        }
        
        .traducao-result p {
            margin: 5px 0;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Tradutor</h1>
        <form action="TraducaoServlet" method="post">
            <div class="form-group">
                <label for="palavra">Digite uma palavra:</label>
                <input type="text" id="palavra" name="palavra" required>
            </div>
            <div class="form-group">
                <input type="submit" value="Traduzir">
            </div>
        </form>
        
        <div class="traducao-result">
            <h2>Resultado:</h2>
            <p>Palavra digitada: ${palavra}</p>
            <p>Tradução: ${traducao}</p>
        </div>
    </div>
</body>
</html>
