\encoding UTF-8

CREATE TABLE fct_message_queue_param
(message_queue_id varchar (50) NOT NULL,
param_key varchar (512) NOT NULL,
param_val varchar (1000) NULL
);


ALTER TABLE fct_message_queue_param
ADD CONSTRAINT fct_message_queue_param_pk PRIMARY KEY(message_queue_id,param_key);

