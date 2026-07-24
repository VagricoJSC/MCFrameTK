package mcframe.clientMSBG.MSBGP0110;

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
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public static final String $crryovr_mons_typ = "crryovr_mons_typ";
	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public static final String $crryovr_mons_typ_nm = "crryovr_mons_typ_nm";
	/**
	 * Account receivable turnover period 入金サイト.<p>
	 *
	 */
	public static final String $rcv_crryovr_mons = "rcv_crryovr_mons";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_day = "rcv_day";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	public static final String $end_bal_p = "end_bal_p";
	public static final String $start_bal_p = "start_bal_p";
	public static final String $one_ar_not_appl_bal_p = "one_ar_not_appl_bal_p";
	public static final String $two_ar_not_appl_bal_p = "two_ar_not_appl_bal_p";
	public static final String $three_ar_not_appl_bal_p = "three_ar_not_appl_bal_p";
	public static final String $four_ar_not_appl_bal_p = "four_ar_not_appl_bal_p";
	public static final String $five_ar_not_appl_bal_p = "five_ar_not_appl_bal_p";
	public static final String $six_ar_not_appl_bal_p = "six_ar_not_appl_bal_p";
	public static final String $ar_slip_not_appl_bal_p = "ar_slip_not_appl_bal_p";
	public static final String $acst_grp_p = "acst_grp_p";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $end_bal = $end_bal_p + ".amt";
	public static final String $start_bal = $start_bal_p + ".amt";
	public static final String $one_ar_not_appl_bal = $one_ar_not_appl_bal_p + ".amt";
	public static final String $two_ar_not_appl_bal = $two_ar_not_appl_bal_p + ".amt";
	public static final String $three_ar_not_appl_bal = $three_ar_not_appl_bal_p + ".amt";
	public static final String $four_ar_not_appl_bal = $four_ar_not_appl_bal_p + ".amt";
	public static final String $five_ar_not_appl_bal = $five_ar_not_appl_bal_p + ".amt";
	public static final String $six_ar_not_appl_bal = $six_ar_not_appl_bal_p + ".amt";
	public static final String $ar_slip_not_appl_bal = $ar_slip_not_appl_bal_p + ".amt";
	public static final String $acst_grp_cd1 = $acst_grp_p + ".bp_grp_cd1";
	public static final String $acst_grp_nm1 = $acst_grp_p + ".bp_grp_nm1";
	public static final String $acst_grp_cd2 = $acst_grp_p + ".bp_grp_cd2";
	public static final String $acst_grp_nm2 = $acst_grp_p + ".bp_grp_nm2";
	public static final String $acst_grp_cd3 = $acst_grp_p + ".bp_grp_cd3";
	public static final String $acst_grp_nm3 = $acst_grp_p + ".bp_grp_nm3";
	public static final String $acst_grp_cd4 = $acst_grp_p + ".bp_grp_cd4";
	public static final String $acst_grp_nm4 = $acst_grp_p + ".bp_grp_nm4";
	public static final String $acst_grp_cd5 = $acst_grp_p + ".bp_grp_cd5";
	public static final String $acst_grp_nm5 = $acst_grp_p + ".bp_grp_nm5";
	public static final String $acst_grp_cd6 = $acst_grp_p + ".bp_grp_cd6";
	public static final String $acst_grp_nm6 = $acst_grp_p + ".bp_grp_nm6";
	public static final String $acst_grp_cd7 = $acst_grp_p + ".bp_grp_cd7";
	public static final String $acst_grp_nm7 = $acst_grp_p + ".bp_grp_nm7";
	public static final String $acst_grp_cd8 = $acst_grp_p + ".bp_grp_cd8";
	public static final String $acst_grp_nm8 = $acst_grp_p + ".bp_grp_nm8";
	public static final String $acst_grp_cd9 = $acst_grp_p + ".bp_grp_cd9";
	public static final String $acst_grp_nm9 = $acst_grp_p + ".bp_grp_nm9";
	public static final String $acst_grp_cd10 = $acst_grp_p + ".bp_grp_cd10";
	public static final String $acst_grp_nm10 = $acst_grp_p + ".bp_grp_nm10";

	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta crryovr_mons_typ_META = createCommonMeta($crryovr_mons_typ, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS_TYP);
	public static final MCMeta crryovr_mons_typ_nm_META = createCommonMeta($crryovr_mons_typ_nm, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS_TYP_NM);
	public static final MCMeta rcv_crryovr_mons_META = createCommonMeta($rcv_crryovr_mons, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta rcv_day_META = createCommonMeta($rcv_day, mcframe.commonMA.meta.MA_META.RCV_DAY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta end_bal_p_META = createInnerRowMeta($end_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta start_bal_p_META = createInnerRowMeta($start_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta one_ar_not_appl_bal_p_META = createInnerRowMeta($one_ar_not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta two_ar_not_appl_bal_p_META = createInnerRowMeta($two_ar_not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta three_ar_not_appl_bal_p_META = createInnerRowMeta($three_ar_not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta four_ar_not_appl_bal_p_META = createInnerRowMeta($four_ar_not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta five_ar_not_appl_bal_p_META = createInnerRowMeta($five_ar_not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta six_ar_not_appl_bal_p_META = createInnerRowMeta($six_ar_not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ar_slip_not_appl_bal_p_META = createInnerRowMeta($ar_slip_not_appl_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta acst_grp_p_META = createInnerRowMeta($acst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			acst_cd_META,
			acst_nm_META,
			iv_no_META,
			bill_cl_day_META,
			crryovr_mons_typ_META,
			crryovr_mons_typ_nm_META,
			rcv_crryovr_mons_META,
			rcv_day_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			amt_dec_place_META,
			wrk_no_p_META,
			ar_typ_META,
			ar_typ_nm_META,
			end_bal_p_META,
			start_bal_p_META,
			one_ar_not_appl_bal_p_META,
			two_ar_not_appl_bal_p_META,
			three_ar_not_appl_bal_p_META,
			four_ar_not_appl_bal_p_META,
			five_ar_not_appl_bal_p_META,
			six_ar_not_appl_bal_p_META,
			ar_slip_not_appl_bal_p_META,
			acst_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"end_bal",
				"start_bal",
				"one_ar_not_appl_bal",
				"two_ar_not_appl_bal",
				"three_ar_not_appl_bal",
				"four_ar_not_appl_bal",
				"five_ar_not_appl_bal",
				"six_ar_not_appl_bal",
				"ar_slip_not_appl_bal",
				"acst_grp_cd1",
				"acst_grp_nm1",
				"acst_grp_cd2",
				"acst_grp_nm2",
				"acst_grp_cd3",
				"acst_grp_nm3",
				"acst_grp_cd4",
				"acst_grp_nm4",
				"acst_grp_cd5",
				"acst_grp_nm5",
				"acst_grp_cd6",
				"acst_grp_nm6",
				"acst_grp_cd7",
				"acst_grp_nm7",
				"acst_grp_cd8",
				"acst_grp_nm8",
				"acst_grp_cd9",
				"acst_grp_nm9",
				"acst_grp_cd10",
				"acst_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$end_bal,
				$start_bal,
				$one_ar_not_appl_bal,
				$two_ar_not_appl_bal,
				$three_ar_not_appl_bal,
				$four_ar_not_appl_bal,
				$five_ar_not_appl_bal,
				$six_ar_not_appl_bal,
				$ar_slip_not_appl_bal,
				$acst_grp_cd1,
				$acst_grp_nm1,
				$acst_grp_cd2,
				$acst_grp_nm2,
				$acst_grp_cd3,
				$acst_grp_nm3,
				$acst_grp_cd4,
				$acst_grp_nm4,
				$acst_grp_cd5,
				$acst_grp_nm5,
				$acst_grp_cd6,
				$acst_grp_nm6,
				$acst_grp_cd7,
				$acst_grp_nm7,
				$acst_grp_cd8,
				$acst_grp_nm8,
				$acst_grp_cd9,
				$acst_grp_nm9,
				$acst_grp_cd10,
				$acst_grp_nm10
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
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
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 0, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 0, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 1, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 1, $ar_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 4, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 4, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 5, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 5, $acst_nm, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 6, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 6, $iv_no, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 7, $bill_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 7, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 7, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 7, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 7, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 7, $bill_cl_day, value);
	}


	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public String crryovr_mons_typ() {
		return getConstString(offset + 8, $crryovr_mons_typ);
	}

	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public void crryovr_mons_typ(String value) {
		setConstString(offset + 8, $crryovr_mons_typ, value);
	}


	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public String crryovr_mons_typ_nm() {
		return getConstString(offset + 9, $crryovr_mons_typ_nm);
	}

	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public void crryovr_mons_typ_nm(String value) {
		setConstString(offset + 9, $crryovr_mons_typ_nm, value);
	}


	/**
	 * Account receivable turnover period 入金サイト.<p>
	 *
	 */
	public MCNumber rcv_crryovr_mons() {
		return getConstNumber(offset + 10, $rcv_crryovr_mons);
	}

	/**
	 * Account receivable turnover period 入金サイト.<p>
	 *
	 */
	public void rcv_crryovr_mons(MCNumber value) {
		setConstNumber(offset + 10, $rcv_crryovr_mons, value);
	}

	/**
	 * Account receivable turnover period 入金サイト.<p>
	 *
	 */
	public void rcv_crryovr_mons(int value) {
		setConstNumber(offset + 10, $rcv_crryovr_mons, value);
	}

	/**
	 * Account receivable turnover period 入金サイト.<p>
	 *
	 */
	public void rcv_crryovr_mons(long value) {
		setConstNumber(offset + 10, $rcv_crryovr_mons, value);
	}

	/**
	 * Account receivable turnover period 入金サイト.<p>
	 *
	 */
	public void rcv_crryovr_mons(float value) {
		setConstNumber(offset + 10, $rcv_crryovr_mons, value);
	}

	/**
	 * Account receivable turnover period 入金サイト.<p>
	 *
	 */
	public void rcv_crryovr_mons(double value) {
		setConstNumber(offset + 10, $rcv_crryovr_mons, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCNumber rcv_day() {
		return getConstNumber(offset + 11, $rcv_day);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_day(MCNumber value) {
		setConstNumber(offset + 11, $rcv_day, value);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_day(int value) {
		setConstNumber(offset + 11, $rcv_day, value);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_day(long value) {
		setConstNumber(offset + 11, $rcv_day, value);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_day(float value) {
		setConstNumber(offset + 11, $rcv_day, value);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_day(double value) {
		setConstNumber(offset + 11, $rcv_day, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 12, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 12, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 13, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 13, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 14, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 15, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 15, $wrk_no_p, row);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 16, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 16, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 17, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 17, $ar_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR end_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 18, $end_bal_p);
	}
	
	public void end_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 18, $end_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR start_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 19, $start_bal_p);
	}
	
	public void start_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 19, $start_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR one_ar_not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 20, $one_ar_not_appl_bal_p);
	}
	
	public void one_ar_not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 20, $one_ar_not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR two_ar_not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 21, $two_ar_not_appl_bal_p);
	}
	
	public void two_ar_not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 21, $two_ar_not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR three_ar_not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 22, $three_ar_not_appl_bal_p);
	}
	
	public void three_ar_not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 22, $three_ar_not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR four_ar_not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 23, $four_ar_not_appl_bal_p);
	}
	
	public void four_ar_not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 23, $four_ar_not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR five_ar_not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 24, $five_ar_not_appl_bal_p);
	}
	
	public void five_ar_not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 24, $five_ar_not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR six_ar_not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 25, $six_ar_not_appl_bal_p);
	}
	
	public void six_ar_not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 25, $six_ar_not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ar_slip_not_appl_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 26, $ar_slip_not_appl_bal_p);
	}
	
	public void ar_slip_not_appl_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 26, $ar_slip_not_appl_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR acst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 27, $acst_grp_p);
	}
	
	public void acst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 27, $acst_grp_p, row);
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
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 30, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 30, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 31, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 31, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 32, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 33, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 33, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 34, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 34, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 35, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 35, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 36, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 36, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 37, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 38, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 38, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			return crryovr_mons_typ();
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			return crryovr_mons_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
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
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons();
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			return rcv_day();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
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

	public String getStringNE(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			return crryovr_mons_typ();
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			return crryovr_mons_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
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
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons();
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			return rcv_day();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
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

	public void setString(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			crryovr_mons_typ(value);
			return;
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			crryovr_mons_typ_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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

	public void setStringNE(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			crryovr_mons_typ(value);
			return;
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			crryovr_mons_typ_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($rcv_crryovr_mons.equalsIgnoreCase(name)) {
			rcv_crryovr_mons(value);
			return;
		}
		if ($rcv_day.equalsIgnoreCase(name)) {
			rcv_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			return end_bal_p();
		}
		if ($start_bal_p.equalsIgnoreCase(name)) {
			return start_bal_p();
		}
		if ($one_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			return one_ar_not_appl_bal_p();
		}
		if ($two_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			return two_ar_not_appl_bal_p();
		}
		if ($three_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			return three_ar_not_appl_bal_p();
		}
		if ($four_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			return four_ar_not_appl_bal_p();
		}
		if ($five_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			return five_ar_not_appl_bal_p();
		}
		if ($six_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			return six_ar_not_appl_bal_p();
		}
		if ($ar_slip_not_appl_bal_p.equalsIgnoreCase(name)) {
			return ar_slip_not_appl_bal_p();
		}
		if ($acst_grp_p.equalsIgnoreCase(name)) {
			return acst_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5010.WrkNoR.class, value)
			);
			return;
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			end_bal_p(
				((MCContainerMeta) end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($start_bal_p.equalsIgnoreCase(name)) {
			start_bal_p(
				((MCContainerMeta) start_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($one_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			one_ar_not_appl_bal_p(
				((MCContainerMeta) one_ar_not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($two_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			two_ar_not_appl_bal_p(
				((MCContainerMeta) two_ar_not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($three_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			three_ar_not_appl_bal_p(
				((MCContainerMeta) three_ar_not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($four_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			four_ar_not_appl_bal_p(
				((MCContainerMeta) four_ar_not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($five_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			five_ar_not_appl_bal_p(
				((MCContainerMeta) five_ar_not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($six_ar_not_appl_bal_p.equalsIgnoreCase(name)) {
			six_ar_not_appl_bal_p(
				((MCContainerMeta) six_ar_not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ar_slip_not_appl_bal_p.equalsIgnoreCase(name)) {
			ar_slip_not_appl_bal_p(
				((MCContainerMeta) ar_slip_not_appl_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($acst_grp_p.equalsIgnoreCase(name)) {
			acst_grp_p(
				((MCContainerMeta) acst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public MCNumber end_bal() {
		return end_bal_p().amt();
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(int value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(long value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(float value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance of current month 当月末残高.<p>
	 *
	 */
	public void end_bal(double value) {
		end_bal_p().amt(value);
	}

	/**
	 * Incurred amount of the month 当月発生額.<p>
	 *
	 */
	public MCNumber start_bal() {
		return start_bal_p().amt();
	}

	/**
	 * Incurred amount of the month 当月発生額.<p>
	 *
	 */
	public void start_bal(MCNumber value) {
		start_bal_p().amt(value);
	}

	/**
	 * Incurred amount of the month 当月発生額.<p>
	 *
	 */
	public void start_bal(int value) {
		start_bal_p().amt(value);
	}

	/**
	 * Incurred amount of the month 当月発生額.<p>
	 *
	 */
	public void start_bal(long value) {
		start_bal_p().amt(value);
	}

	/**
	 * Incurred amount of the month 当月発生額.<p>
	 *
	 */
	public void start_bal(float value) {
		start_bal_p().amt(value);
	}

	/**
	 * Incurred amount of the month 当月発生額.<p>
	 *
	 */
	public void start_bal(double value) {
		start_bal_p().amt(value);
	}

	/**
	 * 1 month １ヶ月.<p>
	 *
	 */
	public MCNumber one_ar_not_appl_bal() {
		return one_ar_not_appl_bal_p().amt();
	}

	/**
	 * 1 month １ヶ月.<p>
	 *
	 */
	public void one_ar_not_appl_bal(MCNumber value) {
		one_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 1 month １ヶ月.<p>
	 *
	 */
	public void one_ar_not_appl_bal(int value) {
		one_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 1 month １ヶ月.<p>
	 *
	 */
	public void one_ar_not_appl_bal(long value) {
		one_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 1 month １ヶ月.<p>
	 *
	 */
	public void one_ar_not_appl_bal(float value) {
		one_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 1 month １ヶ月.<p>
	 *
	 */
	public void one_ar_not_appl_bal(double value) {
		one_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 2 month ２ヶ月.<p>
	 *
	 */
	public MCNumber two_ar_not_appl_bal() {
		return two_ar_not_appl_bal_p().amt();
	}

	/**
	 * 2 month ２ヶ月.<p>
	 *
	 */
	public void two_ar_not_appl_bal(MCNumber value) {
		two_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 2 month ２ヶ月.<p>
	 *
	 */
	public void two_ar_not_appl_bal(int value) {
		two_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 2 month ２ヶ月.<p>
	 *
	 */
	public void two_ar_not_appl_bal(long value) {
		two_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 2 month ２ヶ月.<p>
	 *
	 */
	public void two_ar_not_appl_bal(float value) {
		two_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 2 month ２ヶ月.<p>
	 *
	 */
	public void two_ar_not_appl_bal(double value) {
		two_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 3 month ３ヶ月.<p>
	 *
	 */
	public MCNumber three_ar_not_appl_bal() {
		return three_ar_not_appl_bal_p().amt();
	}

	/**
	 * 3 month ３ヶ月.<p>
	 *
	 */
	public void three_ar_not_appl_bal(MCNumber value) {
		three_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 3 month ３ヶ月.<p>
	 *
	 */
	public void three_ar_not_appl_bal(int value) {
		three_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 3 month ３ヶ月.<p>
	 *
	 */
	public void three_ar_not_appl_bal(long value) {
		three_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 3 month ３ヶ月.<p>
	 *
	 */
	public void three_ar_not_appl_bal(float value) {
		three_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 3 month ３ヶ月.<p>
	 *
	 */
	public void three_ar_not_appl_bal(double value) {
		three_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 4 month ４ヶ月.<p>
	 *
	 */
	public MCNumber four_ar_not_appl_bal() {
		return four_ar_not_appl_bal_p().amt();
	}

	/**
	 * 4 month ４ヶ月.<p>
	 *
	 */
	public void four_ar_not_appl_bal(MCNumber value) {
		four_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 4 month ４ヶ月.<p>
	 *
	 */
	public void four_ar_not_appl_bal(int value) {
		four_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 4 month ４ヶ月.<p>
	 *
	 */
	public void four_ar_not_appl_bal(long value) {
		four_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 4 month ４ヶ月.<p>
	 *
	 */
	public void four_ar_not_appl_bal(float value) {
		four_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 4 month ４ヶ月.<p>
	 *
	 */
	public void four_ar_not_appl_bal(double value) {
		four_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 5 month ５ヶ月.<p>
	 *
	 */
	public MCNumber five_ar_not_appl_bal() {
		return five_ar_not_appl_bal_p().amt();
	}

	/**
	 * 5 month ５ヶ月.<p>
	 *
	 */
	public void five_ar_not_appl_bal(MCNumber value) {
		five_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 5 month ５ヶ月.<p>
	 *
	 */
	public void five_ar_not_appl_bal(int value) {
		five_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 5 month ５ヶ月.<p>
	 *
	 */
	public void five_ar_not_appl_bal(long value) {
		five_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 5 month ５ヶ月.<p>
	 *
	 */
	public void five_ar_not_appl_bal(float value) {
		five_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * 5 month ５ヶ月.<p>
	 *
	 */
	public void five_ar_not_appl_bal(double value) {
		five_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * More than 6 months ６ヶ月超.<p>
	 *
	 */
	public MCNumber six_ar_not_appl_bal() {
		return six_ar_not_appl_bal_p().amt();
	}

	/**
	 * More than 6 months ６ヶ月超.<p>
	 *
	 */
	public void six_ar_not_appl_bal(MCNumber value) {
		six_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * More than 6 months ６ヶ月超.<p>
	 *
	 */
	public void six_ar_not_appl_bal(int value) {
		six_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * More than 6 months ６ヶ月超.<p>
	 *
	 */
	public void six_ar_not_appl_bal(long value) {
		six_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * More than 6 months ６ヶ月超.<p>
	 *
	 */
	public void six_ar_not_appl_bal(float value) {
		six_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * More than 6 months ６ヶ月超.<p>
	 *
	 */
	public void six_ar_not_appl_bal(double value) {
		six_ar_not_appl_bal_p().amt(value);
	}

	/**
	 * Incomplete payment received result 未消込入金実績.<p>
	 *
	 */
	public MCNumber ar_slip_not_appl_bal() {
		return ar_slip_not_appl_bal_p().amt();
	}

	/**
	 * Incomplete payment received result 未消込入金実績.<p>
	 *
	 */
	public void ar_slip_not_appl_bal(MCNumber value) {
		ar_slip_not_appl_bal_p().amt(value);
	}

	/**
	 * Incomplete payment received result 未消込入金実績.<p>
	 *
	 */
	public void ar_slip_not_appl_bal(int value) {
		ar_slip_not_appl_bal_p().amt(value);
	}

	/**
	 * Incomplete payment received result 未消込入金実績.<p>
	 *
	 */
	public void ar_slip_not_appl_bal(long value) {
		ar_slip_not_appl_bal_p().amt(value);
	}

	/**
	 * Incomplete payment received result 未消込入金実績.<p>
	 *
	 */
	public void ar_slip_not_appl_bal(float value) {
		ar_slip_not_appl_bal_p().amt(value);
	}

	/**
	 * Incomplete payment received result 未消込入金実績.<p>
	 *
	 */
	public void ar_slip_not_appl_bal(double value) {
		ar_slip_not_appl_bal_p().amt(value);
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public String acst_grp_cd1() {
		return acst_grp_p().bp_grp_cd1();
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public void acst_grp_cd1(String value) {
		acst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public String acst_grp_nm1() {
		return acst_grp_p().bp_grp_nm1();
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public void acst_grp_nm1(String value) {
		acst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public String acst_grp_cd2() {
		return acst_grp_p().bp_grp_cd2();
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public void acst_grp_cd2(String value) {
		acst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public String acst_grp_nm2() {
		return acst_grp_p().bp_grp_nm2();
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public void acst_grp_nm2(String value) {
		acst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public String acst_grp_cd3() {
		return acst_grp_p().bp_grp_cd3();
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public void acst_grp_cd3(String value) {
		acst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public String acst_grp_nm3() {
		return acst_grp_p().bp_grp_nm3();
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public void acst_grp_nm3(String value) {
		acst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public String acst_grp_cd4() {
		return acst_grp_p().bp_grp_cd4();
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public void acst_grp_cd4(String value) {
		acst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public String acst_grp_nm4() {
		return acst_grp_p().bp_grp_nm4();
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public void acst_grp_nm4(String value) {
		acst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public String acst_grp_cd5() {
		return acst_grp_p().bp_grp_cd5();
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public void acst_grp_cd5(String value) {
		acst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public String acst_grp_nm5() {
		return acst_grp_p().bp_grp_nm5();
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public void acst_grp_nm5(String value) {
		acst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public String acst_grp_cd6() {
		return acst_grp_p().bp_grp_cd6();
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public void acst_grp_cd6(String value) {
		acst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public String acst_grp_nm6() {
		return acst_grp_p().bp_grp_nm6();
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public void acst_grp_nm6(String value) {
		acst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public String acst_grp_cd7() {
		return acst_grp_p().bp_grp_cd7();
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public void acst_grp_cd7(String value) {
		acst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public String acst_grp_nm7() {
		return acst_grp_p().bp_grp_nm7();
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public void acst_grp_nm7(String value) {
		acst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public String acst_grp_cd8() {
		return acst_grp_p().bp_grp_cd8();
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public void acst_grp_cd8(String value) {
		acst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public String acst_grp_nm8() {
		return acst_grp_p().bp_grp_nm8();
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public void acst_grp_nm8(String value) {
		acst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public String acst_grp_cd9() {
		return acst_grp_p().bp_grp_cd9();
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public void acst_grp_cd9(String value) {
		acst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public String acst_grp_nm9() {
		return acst_grp_p().bp_grp_nm9();
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public void acst_grp_nm9(String value) {
		acst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public String acst_grp_cd10() {
		return acst_grp_p().bp_grp_cd10();
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public void acst_grp_cd10(String value) {
		acst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public String acst_grp_nm10() {
		return acst_grp_p().bp_grp_nm10();
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public void acst_grp_nm10(String value) {
		acst_grp_p().bp_grp_nm10(value);
	}

}

