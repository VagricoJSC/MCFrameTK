DO
$$
DECLARE
	t_module	VARCHAR(20);
	t_sub_rid	VARCHAR(50);
	t_seq		NUMERIC;
	t_cnt		NUMERIC;
	t_cnt_r		NUMERIC;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('sample_ma_role_fc$submodule', 'varchar', 'integer');
	CALL fcpa_postgres_util$type_is_table_col('sample_ma_role_fc$submodule2', 'varchar', 'integer');
	CALL fcpa_postgres_util$type_is_table_col('sample_ma_role_fc$submodule3', 'varchar', 'integer');

	/* モジュールID定義 */
	t_module := 'FS';
	t_cnt := 1;
	
	/* サブモジュールIDのコレクションを定義 */
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBAP', 1);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBCP', 2);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBDP', 3);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBFP', 4);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBGP', 5);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBIP', 6);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBEP', 7);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSBHP', 8);
	INSERT INTO sample_ma_role_fc$submodule (_elem_, _index_) VALUES ('FSUCP', 9);
	
	/* 最初にモジュールに紐付くロールアイテムを削除する */
	DELETE FROM fcm_roleitem WHERE actype LIKE CONCAT(t_module, '.FS__P%') OR actype LIKE CONCAT(t_module, '.FS__L%');
	
	WHILE(t_cnt <= (SELECT COUNT(*) FROM sample_ma_role_fc$submodule)) LOOP
		
		/* 参照権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '_SHOW');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.show'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.srch*'), '0');
		IF (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt) = 'FSBFP' THEN
			SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
			/* ロール管理(管理者) */
			INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
				VALUES (t_seq, t_sub_rid, '3', 'FS.FSBFP0030.*', '0');
			SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
			/* ユーザ管理(管理者) */
			INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
				VALUES (t_seq, t_sub_rid, '3', 'FS.FSBFP0250.*', '0');
		END IF;
		
		/* 更新権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '_REG');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.show'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.srch*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.upd*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.ins*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.del*'), '0');
		IF (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt) = 'FSBFP' THEN
			SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
			/* ロール管理(管理者) */
			INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
				VALUES (t_seq, t_sub_rid, '3', 'FS.FSBFP0030.*', '0');
			SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
			/* ユーザ管理(管理者) */
			INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
				VALUES (t_seq, t_sub_rid, '3', 'FS.FSBFP0250.*', '0');
		END IF;
		
		/* 出力権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '_OUT');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.prnt*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt), '*.popup_out*'), '0');
		IF (SELECT _elem_ FROM sample_ma_role_fc$submodule WHERE _index_ = t_cnt) = 'FSBFP' THEN
			SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
			/* ロール管理(管理者) */
			INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
				VALUES (t_seq, t_sub_rid, '3', 'FS.FSBFP0030.*', '0');
			SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
			/* ユーザ管理(管理者) */
			INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
				VALUES (t_seq, t_sub_rid, '3', 'FS.FSBFP0250.*', '0');
		END IF;
		
		t_cnt := t_cnt + 1;
	END LOOP;
	
	/* 出力権限のみ設定 */
	INSERT INTO sample_ma_role_fc$submodule2 (_elem_, _index_) VALUES ('FSBBP', 1);
	INSERT INTO sample_ma_role_fc$submodule2 (_elem_, _index_) VALUES ('FSUAP', 2);
	
	t_cnt := 1;
	WHILE(t_cnt <= (SELECT COUNT(*) FROM sample_ma_role_fc$submodule2)) LOOP
		/* 出力権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ma_role_fc$submodule2 WHERE _index_ = t_cnt), '_OUT');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule2 WHERE _index_ = t_cnt), '*.prnt*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule2 WHERE _index_ = t_cnt), '*.popup_out*'), '0');
		
		t_cnt := t_cnt + 1;
	END LOOP;
	
	/* 最初にモジュールに紐付くロールアイテムを削除する */
	t_module := 'FX';
	DELETE FROM fcm_roleitem WHERE actype LIKE CONCAT(t_module, '.FX__P%') OR actype LIKE CONCAT(t_module, '.FX__L%');
	
	/* 出力権限のみ設定 */
	INSERT INTO sample_ma_role_fc$submodule3 (_elem_, _index_) VALUES ('FXUCP', 1);
	
	t_cnt := 1;
	
	WHILE(t_cnt <= (SELECT COUNT(*) FROM sample_ma_role_fc$submodule3)) LOOP
		/* 出力権限データ追加 */
		t_sub_rid := CONCAT(t_module, '_', (SELECT _elem_ FROM sample_ma_role_fc$submodule3 WHERE _index_ = t_cnt), '_OUT');
		SELECT COUNT(*) INTO t_cnt_r FROM fcm_role_all WHERE rid = t_sub_rid;
		IF t_cnt_r = 0 THEN
			INSERT INTO fcm_role_all (rid, rnm, history) VALUES (t_sub_rid, t_sub_rid, '0');
		END IF;
		DELETE FROM fcm_roleitem WHERE rid = t_sub_rid;
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule3 WHERE _index_ = t_cnt), '*.prnt*'), '0');
		SELECT NEXTVAL('fcs_roleitem') INTO t_seq;
		INSERT INTO fcm_roleitem (iid, rid, type_cd, actype, chk_pw)
			VALUES (t_seq, t_sub_rid, '0', CONCAT(t_module, '.', (SELECT _elem_ FROM sample_ma_role_fc$submodule3 WHERE _index_ = t_cnt), '*.popup_out*'), '0');
		
		t_cnt := t_cnt + 1;
	END LOOP;
END;
$$
LANGUAGE plpgsql
;
