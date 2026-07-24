package mcframe.serverMSBC.MSBCL6110;

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
 * ブロック"MfgInstActCom_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public static final String $aprv_tm = "aprv_tm";
	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	/**
	 * Login user ID ログインユーザＩＤ.<p>
	 *
	 */
	public static final String $login_usr_id = "login_usr_id";
	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mfg_aprv_role_cd = "mfg_aprv_role_cd";
	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_upd_cntr = "mfg_inst_upd_cntr";
	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_act_upd_cntr = "mfg_act_upd_cntr";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);
	public static final MCMeta login_usr_id_META = createCommonMeta($login_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta mfg_aprv_role_cd_META = createCommonMeta($mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_act_upd_cntr_META = createCommonMeta($mfg_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);

	protected static final ConstMetaList<MfgInstActCom_Chk01_DtlR> constMetas = new ConstMetaList<MfgInstActCom_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			div_seq_META,
			mfg_act_no_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			aprv_dt_META,
			aprv_tm_META,
			aprv_usr_cd_META,
			aprv_dpt_cd_META,
			aprv_rsn_META,
			login_usr_id_META,
			mfg_aprv_role_cd_META,
			mfg_inst_upd_cntr_META,
			mfg_act_upd_cntr_META,
			err_flg_META,
			rtn_sts_typ_META,
			mfg_mtd_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$aprv_rsn, "E"}	// aprv_rsn
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$aprv_usr_cd, "MA.MAUAL0010.Usr"},	// aprv_usr_cd
				{$aprv_dpt_cd, "MA.MAUAL0010.Dpt"}	// aprv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$aprv_usr_cd, "aprv_dt"},	// aprv_usr_cd
				{$aprv_dpt_cd, "MAC_DPT_IS_SRCH_TYP.MFG;aprv_dt;aprv_usr_cd"}	// aprv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$aprv_usr_cd, "dt"},	// aprv_usr_cd
				{$aprv_dpt_cd, "dpt_is_srch_typ;dt;usr_cd"}	// aprv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
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
	protected MfgInstActCom_Chk01_DtlR_MC_A(ConstMetaList<? extends MfgInstActCom_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Chk01_DtlR clone() {
		return (MfgInstActCom_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Chk01_DtlR createInstance() {
		return (MfgInstActCom_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Chk01_DtlR getValues(String... names) {
		return (MfgInstActCom_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 2, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 2, $itm_mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 3, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 3, $div_seq, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 4, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 4, $mfg_act_no, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 5, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 5, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 6, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 6, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 7, $aprv_dt);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 7, $aprv_dt, value);
	}


	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 8, $aprv_tm);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 8, $aprv_tm, value);
	}


	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 9, $aprv_usr_cd);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 9, $aprv_usr_cd, value);
	}


	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 10, $aprv_dpt_cd);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 10, $aprv_dpt_cd, value);
	}


	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 11, $aprv_rsn);
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 11, $aprv_rsn, value);
	}


	/**
	 * Login user ID ログインユーザＩＤ.<p>
	 *
	 */
	public String login_usr_id() {
		return getConstString(offset + 12, $login_usr_id);
	}

	/**
	 * Login user ID ログインユーザＩＤ.<p>
	 *
	 */
	public void login_usr_id(String value) {
		setConstString(offset + 12, $login_usr_id, value);
	}


	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public String mfg_aprv_role_cd() {
		return getConstString(offset + 13, $mfg_aprv_role_cd);
	}

	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public void mfg_aprv_role_cd(String value) {
		setConstString(offset + 13, $mfg_aprv_role_cd, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 14, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 14, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 14, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 14, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 14, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 14, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_act_upd_cntr() {
		return getConstNumber(offset + 15, $mfg_act_upd_cntr);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 15, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(int value) {
		setConstNumber(offset + 15, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(long value) {
		setConstNumber(offset + 15, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(float value) {
		setConstNumber(offset + 15, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(double value) {
		setConstNumber(offset + 15, $mfg_act_upd_cntr, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 16, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 16, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 17, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 17, $rtn_sts_typ, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 18, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 18, $mfg_mtd_typ, value);
	}


	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($login_usr_id.equalsIgnoreCase(name)) {
			return login_usr_id();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($login_usr_id.equalsIgnoreCase(name)) {
			return login_usr_id();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($login_usr_id.equalsIgnoreCase(name)) {
			login_usr_id(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($login_usr_id.equalsIgnoreCase(name)) {
			login_usr_id(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

