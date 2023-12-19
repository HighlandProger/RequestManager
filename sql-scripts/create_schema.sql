CREATE ROLE manager SUPERUSER CREATEDB INHERIT LOGIN PASSWORD '44';

CREATE DATABASE request_manager_db WITH OWNER manager;
====================================================
psql request_manager_db;
====================================================

CREATE SCHEMA IF NOT EXISTS ncs_manager;
SET
    SEARCH_PATH = ncs_manager;

CREATE TABLE ncs_manager.request_event
(
    id                     bigserial primary key,
    source                 varchar,
    event_time             timestamp(0)
);
