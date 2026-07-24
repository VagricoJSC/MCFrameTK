DO
$$
DECLARE
	t_module	VARCHAR(20);
	t_sub_rid	VARCHAR(50);
	t_seq		NUMERIC;
	t_cnt		NUMERIC;
	t_cnt_r		NUMERIC;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('sample_mb_role$submodule', 'varchar', 'integer');

	/* モジュールID定義 */
	t_module := 'MB';
	t_cnt := 1;
	
	/* サブモジュールIDのコレクションを定義 */
	INSERT INTO sample_mb_role$submodule (_elem_, _index_) VALUES ('MBBA', 1);
	INSERT INTO sample_mb_role$submodule (_elem_, _index_) VALUES ('MBBB', 2);
	INSERT INTO sample_mb_role$submodule (_elem_, _index_) VALUES ('MBBC', 3);
	INSERT INTO sample_mb_role$submodule (_elem_, _index_) VALUES ('MBBE', 4);
	
	/* 最初にモジュールに紐付くロールアイテムを削除する */
	DELETE FROM fcm_roleitem where actype LIKE CONCAT(t_module, '.MB__P%') OR actype LIKE CONCAT(t_module, '.MB__L%');
	
	WHILE(t_cnt <= (SELECT COUNT(*) FROM sample_mb_role$submodule)) LOOP
		
		/* 参照権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '_SHOW');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.show'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.srch*'), '0');
		
		/* 更新権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '_REG');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.show'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.srch*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.upd*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.ins*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.del*'), '0');
			
		/* 出力権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '_OUT');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.prnt*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_mb_role$submodule WHERE _index_ = t_cnt), '*.popup_out*'), '0');
		
		t_cnt := t_cnt + 1;
	END LOOP;
	
END;
$$
LANGUAGE plpgsql
;
