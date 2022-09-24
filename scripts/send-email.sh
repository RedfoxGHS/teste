ls
echo "Inicio da instalação"
sudo apt-get install mailutils
echo "Fim da instalação"
mail -s "subject:Exercicio_S207" "$MAIL" < "Pipeline executada com sucesso!"