package mcframe.clientMSBG.MSBGP0210;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public static final String $rcv_act_upd_cntr = "rcv_act_upd_cntr";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Default account cd. デフォルト口座ＣＤ.<p>
	 *
	 */
	public static final String $def_bank_ac_cd = "def_bank_ac_cd";

	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";
	public static final String $usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $dpt_nm = $usr_dpt_p + ".dpt_nm";

	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_act_upd_cntr_META = createCommonMeta($rcv_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP0330.CanAcDtR.class);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta def_bank_ac_cd_META = createCommonMeta($def_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			trd_ptn_typ_META,
			ar_trd_grp_typ_META,
			trd_nm_META,
			ac_ym_META,
			rcv_act_no_META,
			rcv_act_rev_META,
			rcv_act_seq_META,
			latest_flg_META,
			rcv_act_upd_cntr_META,
			ac_dt_META,
			can_ac_dt_p_META,
			bill_basis_dt_META,
			usr_dpt_p_META,
			wg_cd_META,
			wg_nm_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			def_bank_ac_cd_META
		},
		new String[][]{
			{
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch",
				"usr_cd",
				"usr_nm",
				"dpt_cd",
				"dpt_nm"
			},
			{
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch,
				$usr_cd,
				$usr_nm,
				$dpt_cd,
				$dpt_nm
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;wg_nm;rcv_bank_ac_cd"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "ac_dt;usr_cd;true;MAC_DPT_IS_SRCH_TYP.AR"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;wr_flg;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 1, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 1, $trd_ptn_typ, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 2, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 2, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 3, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 3, $trd_nm, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 4, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 4, $ac_ym, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 5, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 5, $rcv_act_no, value);
	}


	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 6, $rcv_act_rev);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 6, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 6, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 6, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 6, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 6, $rcv_act_rev, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 7, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 8, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 8, $latest_flg, value);
	}


	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public MCNumber rcv_act_upd_cntr() {
		return getConstNumber(offset + 9, $rcv_act_upd_cntr);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 9, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(int value) {
		setConstNumber(offset + 9, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(long value) {
		setConstNumber(offset + 9, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(float value) {
		setConstNumber(offset + 9, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(double value) {
		setConstNumber(offset + 9, $rcv_act_upd_cntr, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 10, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 10, $ac_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0330.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0330.CanAcDtR) getConstInnerRow(offset + 11, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP0330.CanAcDtR row){
		setConstInnerRow(offset + 11, $can_ac_dt_p, row);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 12, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 12, $bill_basis_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 13, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 13, $usr_dpt_p, row);
	}


	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 14, $wg_cd);
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 14, $wg_cd, value);
	}


	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 15, $wg_nm);
	}

	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 15, $wg_nm, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 16, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 16, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 17, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 17, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 18, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 18, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 19, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 19, $ins_func_nm, value);
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
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 22, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 22, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 23, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 23, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 24, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 25, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 26, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 26, $upd_srv_req_no, value);
	}


	/**
	 * Default account cd. デフォルト口座ＣＤ.<p>
	 *
	 */
	public String def_bank_ac_cd() {
		return getConstString(offset + 27, $def_bank_ac_cd);
	}

	/**
	 * Default account cd. デフォルト口座ＣＤ.<p>
	 *
	 */
	public void def_bank_ac_cd(String value) {
		setConstString(offset + 27, $def_bank_ac_cd, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($def_bank_ac_cd.equalsIgnoreCase(name)) {
			return def_bank_ac_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($def_bank_ac_cd.equalsIgnoreCase(name)) {
			return def_bank_ac_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($def_bank_ac_cd.equalsIgnoreCase(name)) {
			def_bank_ac_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($def_bank_ac_cd.equalsIgnoreCase(name)) {
			def_bank_ac_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0330.CanAcDtR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	public String usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	public void usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	public String dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	public void dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

}

