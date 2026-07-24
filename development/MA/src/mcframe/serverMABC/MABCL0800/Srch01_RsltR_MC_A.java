package mcframe.serverMABC.MABCL0800;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public static final String $num_biz_typ_nm = "num_biz_typ_nm";
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public static final String $num_ptn_nm = "num_ptn_nm";
	/**
	 * Key element キー要素.<p>
	 *
	 */
	public static final String $key_elm = "key_elm";
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public static final String $seq_typ = "seq_typ";
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public static final String $seq_typ_old = "seq_typ_old";
	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public static final String $seq_typ_nm = "seq_typ_nm";
	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public static final String $ora_seq_nm = "ora_seq_nm";
	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public static final String $min_val = "min_val";
	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public static final String $max_val = "max_val";
	/**
	 * Increment 増加量.<p>
	 *
	 */
	public static final String $increment_by = "increment_by";
	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public static final String $cycl_flg = "cycl_flg";
	/**
	 * Current value 現在値.<p>
	 *
	 */
	public static final String $last_val = "last_val";
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


	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_biz_typ_nm_META = createCommonMeta($num_biz_typ_nm, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP_NM);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta num_ptn_nm_META = createCommonMeta($num_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta key_elm_META = createCommonMeta($key_elm, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta seq_typ_META = createCommonMeta($seq_typ, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta seq_typ_old_META = createCommonMeta($seq_typ_old, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta seq_typ_nm_META = createCommonMeta($seq_typ_nm, mcframe.commonMA.meta.MA_META.SEQ_TYP_NM);
	public static final MCMeta ora_seq_nm_META = createCommonMeta($ora_seq_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta min_val_META = createCommonMeta($min_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta max_val_META = createCommonMeta($max_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta increment_by_META = createCommonMeta($increment_by, mcframe.commonMA.meta.MA_META.NUM_INC);
	public static final MCMeta cycl_flg_META = createCommonMeta($cycl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_val_META = createCommonMeta($last_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			num_biz_typ_nm_META,
			num_ptn_cd_META,
			num_ptn_nm_META,
			key_elm_META,
			seq_typ_META,
			seq_typ_old_META,
			seq_typ_nm_META,
			ora_seq_nm_META,
			min_val_META,
			max_val_META,
			increment_by_META,
			cycl_flg_META,
			last_val_META,
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
			upd_srv_req_no_META
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
				{$num_biz_typ, "MAC_NUM_BIZ_TYP"},	// num_biz_typ
				{$seq_typ, "MAC_SEQ_TYP"}	// seq_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public String num_biz_typ() {
		return getConstString(offset + 0, $num_biz_typ);
	}

	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public void num_biz_typ(String value) {
		setConstString(offset + 0, $num_biz_typ, value);
	}


	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public String num_biz_typ_nm() {
		return getConstString(offset + 1, $num_biz_typ_nm);
	}

	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public void num_biz_typ_nm(String value) {
		setConstString(offset + 1, $num_biz_typ_nm, value);
	}


	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 2, $num_ptn_cd);
	}

	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 2, $num_ptn_cd, value);
	}


	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public String num_ptn_nm() {
		return getConstString(offset + 3, $num_ptn_nm);
	}

	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public void num_ptn_nm(String value) {
		setConstString(offset + 3, $num_ptn_nm, value);
	}


	/**
	 * Key element キー要素.<p>
	 *
	 */
	public String key_elm() {
		return getConstString(offset + 4, $key_elm);
	}

	/**
	 * Key element キー要素.<p>
	 *
	 */
	public void key_elm(String value) {
		setConstString(offset + 4, $key_elm, value);
	}


	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public String seq_typ() {
		return getConstString(offset + 5, $seq_typ);
	}

	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public void seq_typ(String value) {
		setConstString(offset + 5, $seq_typ, value);
	}


	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public String seq_typ_old() {
		return getConstString(offset + 6, $seq_typ_old);
	}

	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public void seq_typ_old(String value) {
		setConstString(offset + 6, $seq_typ_old, value);
	}


	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public String seq_typ_nm() {
		return getConstString(offset + 7, $seq_typ_nm);
	}

	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public void seq_typ_nm(String value) {
		setConstString(offset + 7, $seq_typ_nm, value);
	}


	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public String ora_seq_nm() {
		return getConstString(offset + 8, $ora_seq_nm);
	}

	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public void ora_seq_nm(String value) {
		setConstString(offset + 8, $ora_seq_nm, value);
	}


	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public MCNumber min_val() {
		return getConstNumber(offset + 9, $min_val);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(MCNumber value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(int value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(long value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(float value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(double value) {
		setConstNumber(offset + 9, $min_val, value);
	}


	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public MCNumber max_val() {
		return getConstNumber(offset + 10, $max_val);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(MCNumber value) {
		setConstNumber(offset + 10, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(int value) {
		setConstNumber(offset + 10, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(long value) {
		setConstNumber(offset + 10, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(float value) {
		setConstNumber(offset + 10, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(double value) {
		setConstNumber(offset + 10, $max_val, value);
	}


	/**
	 * Increment 増加量.<p>
	 *
	 */
	public MCNumber increment_by() {
		return getConstNumber(offset + 11, $increment_by);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(MCNumber value) {
		setConstNumber(offset + 11, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(int value) {
		setConstNumber(offset + 11, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(long value) {
		setConstNumber(offset + 11, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(float value) {
		setConstNumber(offset + 11, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(double value) {
		setConstNumber(offset + 11, $increment_by, value);
	}


	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public boolean cycl_flg() {
		return getConstBoolean(offset + 12, $cycl_flg);
	}

	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public void cycl_flg(boolean value) {
		setConstBoolean(offset + 12, $cycl_flg, value);
	}


	/**
	 * Current value 現在値.<p>
	 *
	 */
	public MCNumber last_val() {
		return getConstNumber(offset + 13, $last_val);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(MCNumber value) {
		setConstNumber(offset + 13, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(int value) {
		setConstNumber(offset + 13, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(long value) {
		setConstNumber(offset + 13, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(float value) {
		setConstNumber(offset + 13, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(double value) {
		setConstNumber(offset + 13, $last_val, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 14, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 14, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 15, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 15, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 16, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 16, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 17, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 17, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 18, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 18, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 19, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 20, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 20, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 21, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 21, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 22, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 22, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 23, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 23, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 24, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 24, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 25, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 25, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			return num_biz_typ_nm();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			return seq_typ();
		}
		if ($seq_typ_old.equalsIgnoreCase(name)) {
			return seq_typ_old();
		}
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			return seq_typ_nm();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
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
		if ($min_val.equalsIgnoreCase(name)) {
			return min_val();
		}
		if ($max_val.equalsIgnoreCase(name)) {
			return max_val();
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			return increment_by();
		}
		if ($last_val.equalsIgnoreCase(name)) {
			return last_val();
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
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			return cycl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			return num_biz_typ_nm();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			return seq_typ();
		}
		if ($seq_typ_old.equalsIgnoreCase(name)) {
			return seq_typ_old();
		}
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			return seq_typ_nm();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
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
		if ($min_val.equalsIgnoreCase(name)) {
			return min_val();
		}
		if ($max_val.equalsIgnoreCase(name)) {
			return max_val();
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			return increment_by();
		}
		if ($last_val.equalsIgnoreCase(name)) {
			return last_val();
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
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			return cycl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			num_biz_typ_nm(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			seq_typ(value);
			return;
		}
		if ($seq_typ_old.equalsIgnoreCase(name)) {
			seq_typ_old(value);
			return;
		}
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			seq_typ_nm(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
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
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
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
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			cycl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			num_biz_typ_nm(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			seq_typ(value);
			return;
		}
		if ($seq_typ_old.equalsIgnoreCase(name)) {
			seq_typ_old(value);
			return;
		}
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			seq_typ_nm(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
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
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
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
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			cycl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

