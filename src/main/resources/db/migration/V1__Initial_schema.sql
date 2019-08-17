BEGIN;

CREATE TABLE "client"
(
    "client_id" SERIAL PRIMARY KEY,
    "name"      VARCHAR(50)              NOT NULL,
    "created"   TIMESTAMP WITH TIME ZONE NOT NULL
)
;

CREATE TABLE "project"
(
    "project_id"  SERIAL PRIMARY KEY,
    "client_id"   INT                      NOT NULL,
    "created"     TIMESTAMP WITH TIME ZONE NOT NULL,
    "name"        VARCHAR(50)              NOT NULL,
    "description" TEXT,
    "hourly_rate" DECIMAL(6, 2),
    CONSTRAINT fk_project_client FOREIGN KEY (client_id) REFERENCES "client" ("client_id") ON UPDATE CASCADE
        ON DELETE RESTRICT
);

CREATE TABLE "task"
(
    "task_id"     SERIAL PRIMARY KEY,
    "project_id"  INT                      NOT NULL,
    "created"     TIMESTAMP WITH TIME ZONE NOT NULL,
    "description" TEXT                     NOT NULL,
    CONSTRAINT "fk_task_project" FOREIGN KEY (project_id) REFERENCES "project" ("project_id") ON UPDATE CASCADE
        ON DELETE RESTRICT

);

CREATE TABLE "task_entry"
(
    "task_entry_id" SERIAL PRIMARY KEY,
    "task_id"       INT                      NOT NULL,
    "start"         TIMESTAMP WITH TIME ZONE NOT NULL,
    "end"           TIMESTAMP WITH TIME ZONE,
    "description"   TEXT                     NOT NULL,
    CONSTRAINT "fk_task_entry_task" FOREIGN KEY ("task_id") REFERENCES "task" ("task_id") ON UPDATE CASCADE
        ON DELETE RESTRICT

);

COMMIT;
