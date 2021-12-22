create table jugador
		(id_juga int unsigned not null auto_increment,
		name_juga varchar (30) not null,
		primary key (id_juga));

	create table juego
		(id_jueg int unsigned not null auto_increment,
		id_juga_jueg int unsigned not null,
		acumulado_jueg int unsigned not null,
		primary key (id_jueg),
		foreign key (id_juga_jueg) references jugador(id_juga));

	create table categoria
		(id_cate int unsigned not null auto_increment,
		 descripcion_cate varchar (50) not null,
         nivel_dificultad_cate int unsigned not null,
		 primary key (id_cate));

    create table pregunta
		(id_preg int unsigned not null auto_increment,
		descripcion_preg varchar (50) not null,
		id_cate_preg int unsigned not null,
		primary key (id_preg),
		foreign key (id_cate_preg) references categoria (id_cate));

        
    create table respuesta
		(id_resp int unsigned not null auto_increment,
		descripcion_resp varchar (50) not null,
        estado_resp  tinyint not null,
		id_preg_resp int unsigned not null,
		primary key (id_resp),
		foreign key (id_preg_resp) references pregunta (id_preg));    