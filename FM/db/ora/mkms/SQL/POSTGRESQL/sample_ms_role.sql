DO
$$
DECLARE
	t_module	VARCHAR(20);
	t_sub_rid	VARCHAR(50);
	t_seq		NUMERIC;
	t_cnt		NUMERIC;
	t_cnt_r		NUMERIC;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('sample_ms_role$submodule', 'varchar', 'integer');

	/* モジュールID定義 */
	t_module := 'MS';
	t_cnt := 1;
	
	/* サブモジュールIDのコレクションを定義 */
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBA', 1);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBB', 2);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBC', 3);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBD', 4);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBE', 5);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBF', 6);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBG', 7);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBH', 8);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSBI', 9);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSLA', 10);
	INSERT INTO sample_ms_role$submodule (_elem_, _index_) VALUES ('MSLC', 11);
	
	/* 最初にモジュールに紐付くロールアイテムを削除する */
	DELETE FROM fcm_roleitem WHERE actype LIKE CONCAT(t_module, '.MS__P%') OR actype LIKE CONCAT(t_module, '.MS__L%');
	
	WHILE(t_cnt <= (SELECT COUNT(*) FROM sample_ms_role$submodule)) LOOP
		
		/* 参照権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '_SHOW');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.show'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.srch*'), '0');
		
		/* 更新権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '_REG');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.show'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.srch*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.upd*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.ins*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.del*'), '0');
			
		/* 出力権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '_OUT');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.prnt*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ms_role$submodule WHERE _index_ = t_cnt), '*.popup_out*'), '0');
		
		t_cnt := t_cnt + 1;
	END LOOP;
	
	/* MSUA（参照権限と出力権限のみ設定） */
	/* 参照権限データ追加 */
	t_sub_rid := CONCAT(t_module, '_', 'MSUAP', '_SHOW');
	SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
	IF t_cnt_r = 0 THEN
		INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
	END IF;
	DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
	SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
	INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
		VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', 'MSUAP', '*.show'), '0');
	SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
	INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
		VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', 'MSUAP', '*.srch*'), '0');
	
	/* 出力権限データ追加 */
	t_sub_rid := CONCAT(t_module, '_', 'MSUAP', '_OUT');
	SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
	IF t_cnt_r = 0 THEN
		INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
	END IF;
	DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
	SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
	INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
		VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', 'MSUAP', '*.prnt*'), '0');
	SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
	INSERT into fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
		VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', 'MSUAP', '*.popup_out*'), '0');
END;
$$
LANGUAGE plpgsql
;
