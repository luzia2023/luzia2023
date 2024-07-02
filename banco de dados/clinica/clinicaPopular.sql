SELECT * FROM clinica2.medico;
use clinica2;



INSERT INTO paciente(
nomepaciente,datanascimento, sexo,cep,cidade, estado, complemento)
values('joão jose', '1980-04-26','M',74846594,'Samamaia','DF', ''),
	   ('Maria', '1977-03-14','F',748486594,'Samamaia','DF', '');
       

insert into 
consulta(
datahora, numerocrm, estadocrm, idpaciente)
values ('2024-06-18 17:40:00', '54674','PE','Ana Maria'),
		('2024-07-02 14:30:00', '54674','PE', 'Ana Maria'),
        ('2024-08-24  10:30:00','854896','DF', 'jose João'); 
        


insert into especialidade( nomeespecialidade)
values ('Clinica Médica'),
	('Fono'),
    ('Ortopedia'),
    ('Ginecologia');
    
	describe medico;
