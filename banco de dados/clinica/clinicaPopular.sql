SELECT * FROM clinica2.medico;
select * from paciente;
use clinica2;


INSERT INTO paciente(
nomepaciente,datanascimento, sexo,cep,cidade, estado, complemento)
values('joão jose', '1980-04-26','M',74846594,'Samamaia','DF', ''),
	   ('Maria', '1977-03-14','F',748486594,'Samamaia','DF', '');
       


INSERT INTO CONSULTA(IDCONSULTA,DATAHORA,NUMEROCRM,ESTADOCRM,IDPACIENTE)
values (null,'2024-06-18 17:40:00', '54674','PE','1'),
		(null,'2024-07-02 14:30:00', '54674','PE', '2'),
        (NULL,'2024-08-24 10:30:00','854896','DF', '3'); 
        select* from consulta;


insert into especialidade( nomeespecialidade)
values ('Clinica Médica'),
	('Fono'),
    ('Ortopedia'),
    ('Ginecologia');
    
	
insert into telefone(telefone, idpaciente)
values ('3333-45-20', '1'),
		('9999-45-26','2' ),
        ('9996-25-13', '1'),
        ('3359-25-65','1');
        
        
        select * from consulta;
insert into possuiespecialidade(,idespecialidade, numerocrm, estadocrm)
values ('1','54674','PE' ),
		('2','),
        ('3',),
        ('4');
        

