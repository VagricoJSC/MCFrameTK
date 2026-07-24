package mcframe.serverMABG.MABGL0360;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public static final String $cost_io_id = "cost_io_id";
	/**
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public static final String $io_col_cd = "io_col_cd";
	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public static final String $io_col_nm_lcl = "io_col_nm_lcl";
	/**
	 * Standard GR/GI column name 標準受払項目名.<p>
	 *
	 */
	public static final String $io_col_nm = "io_col_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $io_seq = "io_seq";
	/**
	 * GR/GI type 受払対象区分.<p>
	 *
	 */
	public static final String $io_tgt_typ = "io_tgt_typ";
	/**
	 * GR/GI type name 受払対象区分名.<p>
	 *
	 */
	public static final String $io_tgt_typ_nm = "io_tgt_typ_nm";
	/**
	 * GR/GI aggregated unit type 受払集計単位区分.<p>
	 *
	 */
	public static final String $io_sml_typ = "io_sml_typ";
	/**
	 * GR/GI aggregated unit type name 受払集計単位区分名.<p>
	 *
	 */
	public static final String $io_sml_typ_nm = "io_sml_typ_nm";
	/**
	 * With gain or loss of chargeable supply 有償差額有.<p>
	 *
	 */
	public static final String $prov_expns_flg = "prov_expns_flg";
	/**
	 * Display unit price 単価表示.<p>
	 *
	 */
	public static final String $unit_flg = "unit_flg";
	/**
	 * Display qty. 数量表示.<p>
	 *
	 */
	public static final String $qty_flg = "qty_flg";
	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public static final String $amt_flg = "amt_flg";
	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public static final String $std_flg = "std_flg";
	/**
	 * Display variance 差異表示.<p>
	 *
	 */
	public static final String $diff_flg = "diff_flg";
	/**
	 * Variance calculation type 差額計算区分.<p>
	 *
	 */
	public static final String $bal_calc_typ = "bal_calc_typ";
	/**
	 * Difference calculation type name 差額計算区分名.<p>
	 *
	 */
	public static final String $bal_calc_typ_nm = "bal_calc_typ_nm";
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public static final String $minus_flg = "minus_flg";
	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public static final String $fg_r = "fg_r";
	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public static final String $fg_g = "fg_g";
	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public static final String $fg_b = "fg_b";
	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public static final String $bg_r = "bg_r";
	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public static final String $bg_g = "bg_g";
	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public static final String $bg_b = "bg_b";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_io_id_META = createCommonMeta($cost_io_id, mcframe.commonMA.meta.MA_META.COST_IO_ID);
	public static final MCMeta io_col_cd_META = createCommonMeta($io_col_cd, mcframe.commonMA.meta.MA_META.IO_COL_CD);
	public static final MCMeta io_col_nm_lcl_META = createCommonMeta($io_col_nm_lcl, mcframe.commonMA.meta.MA_META.IO_COL_NM);
	public static final MCMeta io_col_nm_META = createCommonMeta($io_col_nm, mcframe.commonMA.meta.MA_META.IO_COL_NM);
	public static final MCMeta io_seq_META = createCommonMeta($io_seq, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta io_tgt_typ_META = createCommonMeta($io_tgt_typ, mcframe.commonMA.meta.MA_META.IO_TGT_TYP);
	public static final MCMeta io_tgt_typ_nm_META = createCommonMeta($io_tgt_typ_nm, mcframe.commonMA.meta.MA_META.IO_TGT_TYP_NM);
	public static final MCMeta io_sml_typ_META = createCommonMeta($io_sml_typ, mcframe.commonMA.meta.MA_META.IO_SML_TYP);
	public static final MCMeta io_sml_typ_nm_META = createCommonMeta($io_sml_typ_nm, mcframe.commonMA.meta.MA_META.IO_SML_TYP_NM);
	public static final MCMeta prov_expns_flg_META = createCommonMeta($prov_expns_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unit_flg_META = createCommonMeta($unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_flg_META = createCommonMeta($qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_flg_META = createCommonMeta($amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_flg_META = createCommonMeta($std_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta diff_flg_META = createCommonMeta($diff_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bal_calc_typ_META = createCommonMeta($bal_calc_typ, mcframe.commonMA.meta.MA_META.BAL_CALC_TYP);
	public static final MCMeta bal_calc_typ_nm_META = createCommonMeta($bal_calc_typ_nm, mcframe.commonMA.meta.MA_META.BAL_CALC_TYP_NM);
	public static final MCMeta minus_flg_META = createCommonMeta($minus_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fg_r_META = createNumberMeta($fg_r);
	public static final MCMeta fg_g_META = createNumberMeta($fg_g);
	public static final MCMeta fg_b_META = createNumberMeta($fg_b);
	public static final MCMeta bg_r_META = createNumberMeta($bg_r);
	public static final MCMeta bg_g_META = createNumberMeta($bg_g);
	public static final MCMeta bg_b_META = createNumberMeta($bg_b);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			cost_io_id_META,
			io_col_cd_META,
			io_col_nm_lcl_META,
			io_col_nm_META,
			io_seq_META,
			io_tgt_typ_META,
			io_tgt_typ_nm_META,
			io_sml_typ_META,
			io_sml_typ_nm_META,
			prov_expns_flg_META,
			unit_flg_META,
			qty_flg_META,
			amt_flg_META,
			std_flg_META,
			diff_flg_META,
			bal_calc_typ_META,
			bal_calc_typ_nm_META,
			minus_flg_META,
			fg_r_META,
			fg_g_META,
			fg_b_META,
			bg_r_META,
			bg_g_META,
			bg_b_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$io_tgt_typ, "MAC_IO_TGT_TYP"},	// io_tgt_typ
				{$io_sml_typ, "MAC_IO_SML_TYP"},	// io_sml_typ
				{$bal_calc_typ, "MAC_BAL_CALC_TYP"}	// bal_calc_typ
			}
		))
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCNumber cost_io_id() {
		return getConstNumber(offset + 1, $cost_io_id);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(MCNumber value) {
		setConstNumber(offset + 1, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(int value) {
		setConstNumber(offset + 1, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(long value) {
		setConstNumber(offset + 1, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(float value) {
		setConstNumber(offset + 1, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(double value) {
		setConstNumber(offset + 1, $cost_io_id, value);
	}


	/**
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public String io_col_cd() {
		return getConstString(offset + 2, $io_col_cd);
	}

	/**
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public void io_col_cd(String value) {
		setConstString(offset + 2, $io_col_cd, value);
	}


	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public String io_col_nm_lcl() {
		return getConstString(offset + 3, $io_col_nm_lcl);
	}

	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public void io_col_nm_lcl(String value) {
		setConstString(offset + 3, $io_col_nm_lcl, value);
	}


	/**
	 * Standard GR/GI column name 標準受払項目名.<p>
	 *
	 */
	public String io_col_nm() {
		return getConstString(offset + 4, $io_col_nm);
	}

	/**
	 * Standard GR/GI column name 標準受払項目名.<p>
	 *
	 */
	public void io_col_nm(String value) {
		setConstString(offset + 4, $io_col_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber io_seq() {
		return getConstNumber(offset + 5, $io_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(MCNumber value) {
		setConstNumber(offset + 5, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(int value) {
		setConstNumber(offset + 5, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(long value) {
		setConstNumber(offset + 5, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(float value) {
		setConstNumber(offset + 5, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(double value) {
		setConstNumber(offset + 5, $io_seq, value);
	}


	/**
	 * GR/GI type 受払対象区分.<p>
	 *
	 */
	public String io_tgt_typ() {
		return getConstString(offset + 6, $io_tgt_typ);
	}

	/**
	 * GR/GI type 受払対象区分.<p>
	 *
	 */
	public void io_tgt_typ(String value) {
		setConstString(offset + 6, $io_tgt_typ, value);
	}


	/**
	 * GR/GI type name 受払対象区分名.<p>
	 *
	 */
	public String io_tgt_typ_nm() {
		return getConstString(offset + 7, $io_tgt_typ_nm);
	}

	/**
	 * GR/GI type name 受払対象区分名.<p>
	 *
	 */
	public void io_tgt_typ_nm(String value) {
		setConstString(offset + 7, $io_tgt_typ_nm, value);
	}


	/**
	 * GR/GI aggregated unit type 受払集計単位区分.<p>
	 *
	 */
	public String io_sml_typ() {
		return getConstString(offset + 8, $io_sml_typ);
	}

	/**
	 * GR/GI aggregated unit type 受払集計単位区分.<p>
	 *
	 */
	public void io_sml_typ(String value) {
		setConstString(offset + 8, $io_sml_typ, value);
	}


	/**
	 * GR/GI aggregated unit type name 受払集計単位区分名.<p>
	 *
	 */
	public String io_sml_typ_nm() {
		return getConstString(offset + 9, $io_sml_typ_nm);
	}

	/**
	 * GR/GI aggregated unit type name 受払集計単位区分名.<p>
	 *
	 */
	public void io_sml_typ_nm(String value) {
		setConstString(offset + 9, $io_sml_typ_nm, value);
	}


	/**
	 * With gain or loss of chargeable supply 有償差額有.<p>
	 *
	 */
	public boolean prov_expns_flg() {
		return getConstBoolean(offset + 10, $prov_expns_flg);
	}

	/**
	 * With gain or loss of chargeable supply 有償差額有.<p>
	 *
	 */
	public void prov_expns_flg(boolean value) {
		setConstBoolean(offset + 10, $prov_expns_flg, value);
	}


	/**
	 * Display unit price 単価表示.<p>
	 *
	 */
	public boolean unit_flg() {
		return getConstBoolean(offset + 11, $unit_flg);
	}

	/**
	 * Display unit price 単価表示.<p>
	 *
	 */
	public void unit_flg(boolean value) {
		setConstBoolean(offset + 11, $unit_flg, value);
	}


	/**
	 * Display qty. 数量表示.<p>
	 *
	 */
	public boolean qty_flg() {
		return getConstBoolean(offset + 12, $qty_flg);
	}

	/**
	 * Display qty. 数量表示.<p>
	 *
	 */
	public void qty_flg(boolean value) {
		setConstBoolean(offset + 12, $qty_flg, value);
	}


	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public boolean amt_flg() {
		return getConstBoolean(offset + 13, $amt_flg);
	}

	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public void amt_flg(boolean value) {
		setConstBoolean(offset + 13, $amt_flg, value);
	}


	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public boolean std_flg() {
		return getConstBoolean(offset + 14, $std_flg);
	}

	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public void std_flg(boolean value) {
		setConstBoolean(offset + 14, $std_flg, value);
	}


	/**
	 * Display variance 差異表示.<p>
	 *
	 */
	public boolean diff_flg() {
		return getConstBoolean(offset + 15, $diff_flg);
	}

	/**
	 * Display variance 差異表示.<p>
	 *
	 */
	public void diff_flg(boolean value) {
		setConstBoolean(offset + 15, $diff_flg, value);
	}


	/**
	 * Variance calculation type 差額計算区分.<p>
	 *
	 */
	public String bal_calc_typ() {
		return getConstString(offset + 16, $bal_calc_typ);
	}

	/**
	 * Variance calculation type 差額計算区分.<p>
	 *
	 */
	public void bal_calc_typ(String value) {
		setConstString(offset + 16, $bal_calc_typ, value);
	}


	/**
	 * Difference calculation type name 差額計算区分名.<p>
	 *
	 */
	public String bal_calc_typ_nm() {
		return getConstString(offset + 17, $bal_calc_typ_nm);
	}

	/**
	 * Difference calculation type name 差額計算区分名.<p>
	 *
	 */
	public void bal_calc_typ_nm(String value) {
		setConstString(offset + 17, $bal_calc_typ_nm, value);
	}


	/**
	 * Minus マイナス.<p>
	 *
	 */
	public boolean minus_flg() {
		return getConstBoolean(offset + 18, $minus_flg);
	}

	/**
	 * Minus マイナス.<p>
	 *
	 */
	public void minus_flg(boolean value) {
		setConstBoolean(offset + 18, $minus_flg, value);
	}


	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public MCNumber fg_r() {
		return getConstNumber(offset + 19, $fg_r);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void fg_r(MCNumber value) {
		setConstNumber(offset + 19, $fg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void fg_r(int value) {
		setConstNumber(offset + 19, $fg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void fg_r(long value) {
		setConstNumber(offset + 19, $fg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void fg_r(float value) {
		setConstNumber(offset + 19, $fg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void fg_r(double value) {
		setConstNumber(offset + 19, $fg_r, value);
	}


	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public MCNumber fg_g() {
		return getConstNumber(offset + 20, $fg_g);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void fg_g(MCNumber value) {
		setConstNumber(offset + 20, $fg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void fg_g(int value) {
		setConstNumber(offset + 20, $fg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void fg_g(long value) {
		setConstNumber(offset + 20, $fg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void fg_g(float value) {
		setConstNumber(offset + 20, $fg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void fg_g(double value) {
		setConstNumber(offset + 20, $fg_g, value);
	}


	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public MCNumber fg_b() {
		return getConstNumber(offset + 21, $fg_b);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void fg_b(MCNumber value) {
		setConstNumber(offset + 21, $fg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void fg_b(int value) {
		setConstNumber(offset + 21, $fg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void fg_b(long value) {
		setConstNumber(offset + 21, $fg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void fg_b(float value) {
		setConstNumber(offset + 21, $fg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void fg_b(double value) {
		setConstNumber(offset + 21, $fg_b, value);
	}


	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public MCNumber bg_r() {
		return getConstNumber(offset + 22, $bg_r);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void bg_r(MCNumber value) {
		setConstNumber(offset + 22, $bg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void bg_r(int value) {
		setConstNumber(offset + 22, $bg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void bg_r(long value) {
		setConstNumber(offset + 22, $bg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void bg_r(float value) {
		setConstNumber(offset + 22, $bg_r, value);
	}

	/**
	 * Color (Red) 色（赤）.<p>
	 *
	 */
	public void bg_r(double value) {
		setConstNumber(offset + 22, $bg_r, value);
	}


	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public MCNumber bg_g() {
		return getConstNumber(offset + 23, $bg_g);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void bg_g(MCNumber value) {
		setConstNumber(offset + 23, $bg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void bg_g(int value) {
		setConstNumber(offset + 23, $bg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void bg_g(long value) {
		setConstNumber(offset + 23, $bg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void bg_g(float value) {
		setConstNumber(offset + 23, $bg_g, value);
	}

	/**
	 * Color (Green) 色（緑）.<p>
	 *
	 */
	public void bg_g(double value) {
		setConstNumber(offset + 23, $bg_g, value);
	}


	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public MCNumber bg_b() {
		return getConstNumber(offset + 24, $bg_b);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void bg_b(MCNumber value) {
		setConstNumber(offset + 24, $bg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void bg_b(int value) {
		setConstNumber(offset + 24, $bg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void bg_b(long value) {
		setConstNumber(offset + 24, $bg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void bg_b(float value) {
		setConstNumber(offset + 24, $bg_b, value);
	}

	/**
	 * Color (Blue) 色（青）.<p>
	 *
	 */
	public void bg_b(double value) {
		setConstNumber(offset + 24, $bg_b, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 25, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 25, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 26, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 26, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 27, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 27, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 28, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 28, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 29, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 29, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 30, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 31, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 31, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 32, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 32, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 33, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 34, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 34, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 35, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 35, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 36, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 36, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 37, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 37, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 38, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 38, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 39, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 39, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 40, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 40, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 41, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 41, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 42, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 42, $del_ts, value);
	}


	public String getString(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($io_col_nm_lcl.equalsIgnoreCase(name)) {
			return io_col_nm_lcl();
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			return io_col_nm();
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			return io_tgt_typ();
		}
		if ($io_tgt_typ_nm.equalsIgnoreCase(name)) {
			return io_tgt_typ_nm();
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			return io_sml_typ();
		}
		if ($io_sml_typ_nm.equalsIgnoreCase(name)) {
			return io_sml_typ_nm();
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			return bal_calc_typ();
		}
		if ($bal_calc_typ_nm.equalsIgnoreCase(name)) {
			return bal_calc_typ_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			return io_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			return prov_expns_flg();
		}
		if ($unit_flg.equalsIgnoreCase(name)) {
			return unit_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			return diff_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($io_col_nm_lcl.equalsIgnoreCase(name)) {
			return io_col_nm_lcl();
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			return io_col_nm();
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			return io_tgt_typ();
		}
		if ($io_tgt_typ_nm.equalsIgnoreCase(name)) {
			return io_tgt_typ_nm();
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			return io_sml_typ();
		}
		if ($io_sml_typ_nm.equalsIgnoreCase(name)) {
			return io_sml_typ_nm();
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			return bal_calc_typ();
		}
		if ($bal_calc_typ_nm.equalsIgnoreCase(name)) {
			return bal_calc_typ_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			return io_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			return prov_expns_flg();
		}
		if ($unit_flg.equalsIgnoreCase(name)) {
			return unit_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			return diff_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($io_col_nm_lcl.equalsIgnoreCase(name)) {
			io_col_nm_lcl(value);
			return;
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			io_col_nm(value);
			return;
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			io_tgt_typ(value);
			return;
		}
		if ($io_tgt_typ_nm.equalsIgnoreCase(name)) {
			io_tgt_typ_nm(value);
			return;
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			io_sml_typ(value);
			return;
		}
		if ($io_sml_typ_nm.equalsIgnoreCase(name)) {
			io_sml_typ_nm(value);
			return;
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			bal_calc_typ(value);
			return;
		}
		if ($bal_calc_typ_nm.equalsIgnoreCase(name)) {
			bal_calc_typ_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			prov_expns_flg(value);
			return;
		}
		if ($unit_flg.equalsIgnoreCase(name)) {
			unit_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
			return;
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			diff_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($io_col_nm_lcl.equalsIgnoreCase(name)) {
			io_col_nm_lcl(value);
			return;
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			io_col_nm(value);
			return;
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			io_tgt_typ(value);
			return;
		}
		if ($io_tgt_typ_nm.equalsIgnoreCase(name)) {
			io_tgt_typ_nm(value);
			return;
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			io_sml_typ(value);
			return;
		}
		if ($io_sml_typ_nm.equalsIgnoreCase(name)) {
			io_sml_typ_nm(value);
			return;
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			bal_calc_typ(value);
			return;
		}
		if ($bal_calc_typ_nm.equalsIgnoreCase(name)) {
			bal_calc_typ_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			prov_expns_flg(value);
			return;
		}
		if ($unit_flg.equalsIgnoreCase(name)) {
			unit_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
			return;
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			diff_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

