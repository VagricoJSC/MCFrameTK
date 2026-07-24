package mcframe.clientMBBE.MBBEP0050;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * File classification type ファイル種類区分.<p>
	 *
	 */
	public static final String $biz_dat_file_typ = "biz_dat_file_typ";
	/**
	 * File classification type name ファイル種類区分名.<p>
	 *
	 */
	public static final String $biz_dat_file_typ_nm = "biz_dat_file_typ_nm";
	/**
	 * Business data download execution status type 業務データダウンロード実行状況区分.<p>
	 *
	 */
	public static final String $biz_dat_dl_sts_typ = "biz_dat_dl_sts_typ";
	/**
	 * Business data download execution status type name 業務データダウンロード実行状況区分名.<p>
	 *
	 */
	public static final String $biz_dat_dl_sts_typ_nm = "biz_dat_dl_sts_typ_nm";
	/**
	 * Process start date and time 処理開始日時.<p>
	 *
	 */
	public static final String $proc_st_tm = "proc_st_tm";
	/**
	 * Process end date 処理終了日時.<p>
	 *
	 */
	public static final String $proc_end_tm = "proc_end_tm";
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public static final String $biz_dat_id = "biz_dat_id";
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public static final String $biz_dat_nm = "biz_dat_nm";
	/**
	 * Download date and time ダウンロード日時.<p>
	 *
	 */
	public static final String $dl_tm = "dl_tm";
	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public static final String $dl_file_path = "dl_file_path";
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $dl_file_nm = "dl_file_nm";
	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public static final String $data_cnt = "data_cnt";
	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public static final String $file_size = "file_size";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public static final String $biz_dat_dl_cond = "biz_dat_dl_cond";
	/**
	 * Business data download execution history No. 業務データダウンロード実行履歴ＮＯ.<p>
	 *
	 */
	public static final String $biz_dat_dl_hst_no = "biz_dat_dl_hst_no";
	public static final String $rts_msg_p = "rts_msg_p";
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $biz_dat_rmrks1 = "biz_dat_rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $biz_dat_rmrks2 = "biz_dat_rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $biz_dat_rmrks3 = "biz_dat_rmrks3";
	/**
	 * File ファイル.<p>
	 *
	 */
	public static final String $file_bin = "file_bin";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";

	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta biz_dat_file_typ_META = createCommonMeta($biz_dat_file_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_FILE_TYP);
	public static final MCMeta biz_dat_file_typ_nm_META = createCommonMeta($biz_dat_file_typ_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_FILE_TYP_NM);
	public static final MCMeta biz_dat_dl_sts_typ_META = createCommonMeta($biz_dat_dl_sts_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_STS_TYP);
	public static final MCMeta biz_dat_dl_sts_typ_nm_META = createCommonMeta($biz_dat_dl_sts_typ_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_STS_TYP_NM);
	public static final MCMeta proc_st_tm_META = createCommonMeta($proc_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta proc_end_tm_META = createCommonMeta($proc_end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta biz_dat_nm_META = createCommonMeta($biz_dat_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_NM);
	public static final MCMeta dl_tm_META = createCommonMeta($dl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dl_file_path_META = createCommonMeta($dl_file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta dl_file_nm_META = createCommonMeta($dl_file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta data_cnt_META = createCommonMeta($data_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta file_size_META = createCommonMeta($file_size, mcframe.commonMA.meta.MA_META.FILE_SIZE);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta biz_dat_dl_cond_META = createCommonMeta($biz_dat_dl_cond, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_COND);
	public static final MCMeta biz_dat_dl_hst_no_META = createCommonMeta($biz_dat_dl_hst_no, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_HST_NO);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta biz_dat_rmrks1_META = createCommonMeta($biz_dat_rmrks1, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks2_META = createCommonMeta($biz_dat_rmrks2, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks3_META = createCommonMeta($biz_dat_rmrks3, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta file_bin_META = createCommonMeta($file_bin, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			biz_dat_file_typ_META,
			biz_dat_file_typ_nm_META,
			biz_dat_dl_sts_typ_META,
			biz_dat_dl_sts_typ_nm_META,
			proc_st_tm_META,
			proc_end_tm_META,
			biz_dat_id_META,
			biz_dat_nm_META,
			dl_tm_META,
			dl_file_path_META,
			dl_file_nm_META,
			data_cnt_META,
			file_size_META,
			usr_cd_META,
			usr_nm_META,
			biz_dat_dl_cond_META,
			biz_dat_dl_hst_no_META,
			rts_msg_p_META,
			biz_dat_rmrks1_META,
			biz_dat_rmrks2_META,
			biz_dat_rmrks3_META,
			file_bin_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			upd_cntr_META
		},
		new String[][]{
			{
				"rtn_sts_typ"
			},
			{
				$rtn_sts_typ
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * File classification type ファイル種類区分.<p>
	 *
	 */
	public String biz_dat_file_typ() {
		return getConstString(offset + 1, $biz_dat_file_typ);
	}

	/**
	 * File classification type ファイル種類区分.<p>
	 *
	 */
	public void biz_dat_file_typ(String value) {
		setConstString(offset + 1, $biz_dat_file_typ, value);
	}


	/**
	 * File classification type name ファイル種類区分名.<p>
	 *
	 */
	public String biz_dat_file_typ_nm() {
		return getConstString(offset + 2, $biz_dat_file_typ_nm);
	}

	/**
	 * File classification type name ファイル種類区分名.<p>
	 *
	 */
	public void biz_dat_file_typ_nm(String value) {
		setConstString(offset + 2, $biz_dat_file_typ_nm, value);
	}


	/**
	 * Business data download execution status type 業務データダウンロード実行状況区分.<p>
	 *
	 */
	public String biz_dat_dl_sts_typ() {
		return getConstString(offset + 3, $biz_dat_dl_sts_typ);
	}

	/**
	 * Business data download execution status type 業務データダウンロード実行状況区分.<p>
	 *
	 */
	public void biz_dat_dl_sts_typ(String value) {
		setConstString(offset + 3, $biz_dat_dl_sts_typ, value);
	}


	/**
	 * Business data download execution status type name 業務データダウンロード実行状況区分名.<p>
	 *
	 */
	public String biz_dat_dl_sts_typ_nm() {
		return getConstString(offset + 4, $biz_dat_dl_sts_typ_nm);
	}

	/**
	 * Business data download execution status type name 業務データダウンロード実行状況区分名.<p>
	 *
	 */
	public void biz_dat_dl_sts_typ_nm(String value) {
		setConstString(offset + 4, $biz_dat_dl_sts_typ_nm, value);
	}


	/**
	 * Process start date and time 処理開始日時.<p>
	 *
	 */
	public MCDate proc_st_tm() {
		return getConstDate(offset + 5, $proc_st_tm);
	}

	/**
	 * Process start date and time 処理開始日時.<p>
	 *
	 */
	public void proc_st_tm(MCDate value) {
		setConstDate(offset + 5, $proc_st_tm, value);
	}


	/**
	 * Process end date 処理終了日時.<p>
	 *
	 */
	public MCDate proc_end_tm() {
		return getConstDate(offset + 6, $proc_end_tm);
	}

	/**
	 * Process end date 処理終了日時.<p>
	 *
	 */
	public void proc_end_tm(MCDate value) {
		setConstDate(offset + 6, $proc_end_tm, value);
	}


	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public String biz_dat_id() {
		return getConstString(offset + 7, $biz_dat_id);
	}

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public void biz_dat_id(String value) {
		setConstString(offset + 7, $biz_dat_id, value);
	}


	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public String biz_dat_nm() {
		return getConstString(offset + 8, $biz_dat_nm);
	}

	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public void biz_dat_nm(String value) {
		setConstString(offset + 8, $biz_dat_nm, value);
	}


	/**
	 * Download date and time ダウンロード日時.<p>
	 *
	 */
	public MCDate dl_tm() {
		return getConstDate(offset + 9, $dl_tm);
	}

	/**
	 * Download date and time ダウンロード日時.<p>
	 *
	 */
	public void dl_tm(MCDate value) {
		setConstDate(offset + 9, $dl_tm, value);
	}


	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public String dl_file_path() {
		return getConstString(offset + 10, $dl_file_path);
	}

	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public void dl_file_path(String value) {
		setConstString(offset + 10, $dl_file_path, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String dl_file_nm() {
		return getConstString(offset + 11, $dl_file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void dl_file_nm(String value) {
		setConstString(offset + 11, $dl_file_nm, value);
	}


	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public MCNumber data_cnt() {
		return getConstNumber(offset + 12, $data_cnt);
	}

	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public void data_cnt(MCNumber value) {
		setConstNumber(offset + 12, $data_cnt, value);
	}

	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public void data_cnt(int value) {
		setConstNumber(offset + 12, $data_cnt, value);
	}

	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public void data_cnt(long value) {
		setConstNumber(offset + 12, $data_cnt, value);
	}

	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public void data_cnt(float value) {
		setConstNumber(offset + 12, $data_cnt, value);
	}

	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public void data_cnt(double value) {
		setConstNumber(offset + 12, $data_cnt, value);
	}


	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public MCNumber file_size() {
		return getConstNumber(offset + 13, $file_size);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void file_size(MCNumber value) {
		setConstNumber(offset + 13, $file_size, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void file_size(int value) {
		setConstNumber(offset + 13, $file_size, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void file_size(long value) {
		setConstNumber(offset + 13, $file_size, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void file_size(float value) {
		setConstNumber(offset + 13, $file_size, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void file_size(double value) {
		setConstNumber(offset + 13, $file_size, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 14, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 14, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 15, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 15, $usr_nm, value);
	}


	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public String biz_dat_dl_cond() {
		return getConstString(offset + 16, $biz_dat_dl_cond);
	}

	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public void biz_dat_dl_cond(String value) {
		setConstString(offset + 16, $biz_dat_dl_cond, value);
	}


	/**
	 * Business data download execution history No. 業務データダウンロード実行履歴ＮＯ.<p>
	 *
	 */
	public String biz_dat_dl_hst_no() {
		return getConstString(offset + 17, $biz_dat_dl_hst_no);
	}

	/**
	 * Business data download execution history No. 業務データダウンロード実行履歴ＮＯ.<p>
	 *
	 */
	public void biz_dat_dl_hst_no(String value) {
		setConstString(offset + 17, $biz_dat_dl_hst_no, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 18, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 18, $rts_msg_p, row);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String biz_dat_rmrks1() {
		return getConstString(offset + 19, $biz_dat_rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void biz_dat_rmrks1(String value) {
		setConstString(offset + 19, $biz_dat_rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String biz_dat_rmrks2() {
		return getConstString(offset + 20, $biz_dat_rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void biz_dat_rmrks2(String value) {
		setConstString(offset + 20, $biz_dat_rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String biz_dat_rmrks3() {
		return getConstString(offset + 21, $biz_dat_rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void biz_dat_rmrks3(String value) {
		setConstString(offset + 21, $biz_dat_rmrks3, value);
	}


	/**
	 * File ファイル.<p>
	 *
	 */
	public MCBinary file_bin() {
		return getConstBinary(offset + 22, $file_bin);
	}

	/**
	 * File ファイル.<p>
	 *
	 */
	public void file_bin(MCBinary value) {
		setConstBinary(offset + 22, $file_bin, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 23, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 23, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 24, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 24, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 25, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 26, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 27, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 27, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 28, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 28, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 29, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 29, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 31, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 32, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 32, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 33, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 33, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 34, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($biz_dat_file_typ_nm.equalsIgnoreCase(name)) {
			return biz_dat_file_typ_nm();
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			return biz_dat_dl_sts_typ();
		}
		if ($biz_dat_dl_sts_typ_nm.equalsIgnoreCase(name)) {
			return biz_dat_dl_sts_typ_nm();
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			return dl_file_path();
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			return dl_file_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			return biz_dat_dl_cond();
		}
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			return biz_dat_dl_hst_no();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			return data_cnt();
		}
		if ($file_size.equalsIgnoreCase(name)) {
			return file_size();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			return proc_st_tm();
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			return proc_end_tm();
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			return dl_tm();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($biz_dat_file_typ_nm.equalsIgnoreCase(name)) {
			return biz_dat_file_typ_nm();
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			return biz_dat_dl_sts_typ();
		}
		if ($biz_dat_dl_sts_typ_nm.equalsIgnoreCase(name)) {
			return biz_dat_dl_sts_typ_nm();
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			return dl_file_path();
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			return dl_file_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			return biz_dat_dl_cond();
		}
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			return biz_dat_dl_hst_no();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			return data_cnt();
		}
		if ($file_size.equalsIgnoreCase(name)) {
			return file_size();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			return proc_st_tm();
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			return proc_end_tm();
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			return dl_tm();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($biz_dat_file_typ_nm.equalsIgnoreCase(name)) {
			biz_dat_file_typ_nm(value);
			return;
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			biz_dat_dl_sts_typ(value);
			return;
		}
		if ($biz_dat_dl_sts_typ_nm.equalsIgnoreCase(name)) {
			biz_dat_dl_sts_typ_nm(value);
			return;
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			dl_file_path(value);
			return;
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			dl_file_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			biz_dat_dl_cond(value);
			return;
		}
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			biz_dat_dl_hst_no(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			proc_st_tm(value);
			return;
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			proc_end_tm(value);
			return;
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			dl_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($biz_dat_file_typ_nm.equalsIgnoreCase(name)) {
			biz_dat_file_typ_nm(value);
			return;
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			biz_dat_dl_sts_typ(value);
			return;
		}
		if ($biz_dat_dl_sts_typ_nm.equalsIgnoreCase(name)) {
			biz_dat_dl_sts_typ_nm(value);
			return;
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			dl_file_path(value);
			return;
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			dl_file_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			biz_dat_dl_cond(value);
			return;
		}
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			biz_dat_dl_hst_no(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			proc_st_tm(value);
			return;
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			proc_end_tm(value);
			return;
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			dl_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinaryNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

