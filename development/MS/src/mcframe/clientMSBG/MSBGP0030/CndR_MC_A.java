package mcframe.clientMSBG.MSBGP0030;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * PRT,Issue report,1;REF,View,0 PRT,帳票発行,1;REF,参照する,0.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Unprocessed 未処理.<p>
	 *
	 */
	public static final String $not_cl_flg = "not_cl_flg";
	/**
	 * Batch closing バッチ締.<p>
	 *
	 */
	public static final String $cl_batch_flg = "cl_batch_flg";
	/**
	 * Screen closing 画面締.<p>
	 *
	 */
	public static final String $cl_scrn_flg = "cl_scrn_flg";
	/**
	 * Billing per transaction 都度請求.<p>
	 *
	 */
	public static final String $each_sls_flg = "each_sls_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $not_prnt_flg = "not_prnt_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Domestic 国内.<p>
	 *
	 */
	public static final String $dmstic_flg = "dmstic_flg";
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 * Not adjusted 未調整.<p>
	 *
	 */
	public static final String $not_adjst_flg = "not_adjst_flg";
	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public static final String $adjst_flg = "adjst_flg";
	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public static final String $on_edi_flg = "on_edi_flg";
	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public static final String $off_edi_flg = "off_edi_flg";
	/**
	 * Billing month FROM 請求年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $bill_cl_ym_from = "bill_cl_ym_from";
	/**
	 * Billing month TO 請求年月ＴＯ.<p>
	 *
	 */
	public static final String $bill_cl_ym_to = "bill_cl_ym_to";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Scheduled payment receipt date FROM 入金予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rcv_schd_dt_from = "rcv_schd_dt_from";
	/**
	 * Scheduled payment receipt date TO 入金予定日ＴＯ.<p>
	 *
	 */
	public static final String $rcv_schd_dt_to = "rcv_schd_dt_to";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
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
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public static final String $pre_bill_no = "pre_bill_no";
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
	public static final String $wrkno_p = "wrkno_p";
	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public static final String $inc_no_bill_flg = "inc_no_bill_flg";
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Exclude not to issue 発行対象外を除く.<p>
	 *
	 */
	public static final String $not_prnt_ex_flg = "not_prnt_ex_flg";
	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public static final String $rcv_schd_adjst_flg = "rcv_schd_adjst_flg";
	public static final String $billGrp_p = "billGrp_p";

	public static final String $wrk_no = $wrkno_p + ".wrk_no";
	public static final String $wrk_nm = $wrkno_p + ".wrk_nm";
	public static final String $bp_grp_lab1 = $billGrp_p + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $billGrp_p + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $billGrp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $billGrp_p + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $billGrp_p + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $billGrp_p + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $billGrp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $billGrp_p + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $billGrp_p + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $billGrp_p + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $billGrp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $billGrp_p + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $billGrp_p + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $billGrp_p + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $billGrp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $billGrp_p + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $billGrp_p + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $billGrp_p + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $billGrp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $billGrp_p + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $billGrp_p + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $billGrp_p + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $billGrp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $billGrp_p + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $billGrp_p + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $billGrp_p + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $billGrp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $billGrp_p + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $billGrp_p + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $billGrp_p + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $billGrp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $billGrp_p + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $billGrp_p + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $billGrp_p + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $billGrp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $billGrp_p + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $billGrp_p + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $billGrp_p + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $billGrp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $billGrp_p + ".bp_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta not_cl_flg_META = createCommonMeta($not_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cl_batch_flg_META = createCommonMeta($cl_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cl_scrn_flg_META = createCommonMeta($cl_scrn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta each_sls_flg_META = createCommonMeta($each_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_prnt_flg_META = createCommonMeta($not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dmstic_flg_META = createCommonMeta($dmstic_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_adjst_flg_META = createCommonMeta($not_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adjst_flg_META = createCommonMeta($adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_edi_flg_META = createCommonMeta($on_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_edi_flg_META = createCommonMeta($off_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cl_ym_from_META = createCommonMeta($bill_cl_ym_from, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_ym_to_META = createCommonMeta($bill_cl_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta rcv_schd_dt_from_META = createCommonMeta($rcv_schd_dt_from, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_dt_to_META = createCommonMeta($rcv_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta wrkno_p_META = createInnerRowMeta($wrkno_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta inc_no_bill_flg_META = createCommonMeta($inc_no_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_prnt_ex_flg_META = createCommonMeta($not_prnt_ex_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_schd_adjst_flg_META = createCommonMeta($rcv_schd_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta billGrp_p_META = createInnerRowMeta($billGrp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			not_cl_flg_META,
			cl_batch_flg_META,
			cl_scrn_flg_META,
			each_sls_flg_META,
			not_prnt_flg_META,
			prnt_flg_META,
			dmstic_flg_META,
			foreign_flg_META,
			not_adjst_flg_META,
			adjst_flg_META,
			on_edi_flg_META,
			off_edi_flg_META,
			bill_cl_ym_from_META,
			bill_cl_ym_to_META,
			bill_cl_day_META,
			rcv_schd_dt_from_META,
			rcv_schd_dt_to_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			bill_no_META,
			iv_no_META,
			pre_bill_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			wrkno_p_META,
			inc_no_bill_flg_META,
			interim_flg_META,
			not_prnt_ex_flg_META,
			rcv_schd_adjst_flg_META,
			billGrp_p_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10
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
				{$bill_dpt_cd, "dpt_nm"},	// bill_dpt_cd
				{$bcst_cd, "bp_nm"},	// bcst_cd
				{$trd_cur_cd, "cur_nm"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bill_dpt_cd, "true;MAC_DPT_IS_SRCH_TYP.AR;true"},	// bill_dpt_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"}	// bcst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bill_dpt_cd, "dpt_nm_rem_flg;dpt_is_srch_typ;mode_today_flg"},	// bill_dpt_cd
				{$bcst_cd, "bp_is_srch_typ"}	// bcst_cd
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * PRT,Issue report,1;REF,View,0 PRT,帳票発行,1;REF,参照する,0.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * PRT,Issue report,1;REF,View,0 PRT,帳票発行,1;REF,参照する,0.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Unprocessed 未処理.<p>
	 *
	 */
	public boolean not_cl_flg() {
		return getConstBoolean(offset + 1, $not_cl_flg);
	}

	/**
	 * Unprocessed 未処理.<p>
	 *
	 */
	public void not_cl_flg(boolean value) {
		setConstBoolean(offset + 1, $not_cl_flg, value);
	}


	/**
	 * Batch closing バッチ締.<p>
	 *
	 */
	public boolean cl_batch_flg() {
		return getConstBoolean(offset + 2, $cl_batch_flg);
	}

	/**
	 * Batch closing バッチ締.<p>
	 *
	 */
	public void cl_batch_flg(boolean value) {
		setConstBoolean(offset + 2, $cl_batch_flg, value);
	}


	/**
	 * Screen closing 画面締.<p>
	 *
	 */
	public boolean cl_scrn_flg() {
		return getConstBoolean(offset + 3, $cl_scrn_flg);
	}

	/**
	 * Screen closing 画面締.<p>
	 *
	 */
	public void cl_scrn_flg(boolean value) {
		setConstBoolean(offset + 3, $cl_scrn_flg, value);
	}


	/**
	 * Billing per transaction 都度請求.<p>
	 *
	 */
	public boolean each_sls_flg() {
		return getConstBoolean(offset + 4, $each_sls_flg);
	}

	/**
	 * Billing per transaction 都度請求.<p>
	 *
	 */
	public void each_sls_flg(boolean value) {
		setConstBoolean(offset + 4, $each_sls_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_prnt_flg() {
		return getConstBoolean(offset + 5, $not_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_prnt_flg(boolean value) {
		setConstBoolean(offset + 5, $not_prnt_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 6, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $prnt_flg, value);
	}


	/**
	 * Domestic 国内.<p>
	 *
	 */
	public boolean dmstic_flg() {
		return getConstBoolean(offset + 7, $dmstic_flg);
	}

	/**
	 * Domestic 国内.<p>
	 *
	 */
	public void dmstic_flg(boolean value) {
		setConstBoolean(offset + 7, $dmstic_flg, value);
	}


	/**
	 * Foreign 国外.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 8, $foreign_flg);
	}

	/**
	 * Foreign 国外.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 8, $foreign_flg, value);
	}


	/**
	 * Not adjusted 未調整.<p>
	 *
	 */
	public boolean not_adjst_flg() {
		return getConstBoolean(offset + 9, $not_adjst_flg);
	}

	/**
	 * Not adjusted 未調整.<p>
	 *
	 */
	public void not_adjst_flg(boolean value) {
		setConstBoolean(offset + 9, $not_adjst_flg, value);
	}


	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public boolean adjst_flg() {
		return getConstBoolean(offset + 10, $adjst_flg);
	}

	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public void adjst_flg(boolean value) {
		setConstBoolean(offset + 10, $adjst_flg, value);
	}


	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public boolean on_edi_flg() {
		return getConstBoolean(offset + 11, $on_edi_flg);
	}

	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public void on_edi_flg(boolean value) {
		setConstBoolean(offset + 11, $on_edi_flg, value);
	}


	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public boolean off_edi_flg() {
		return getConstBoolean(offset + 12, $off_edi_flg);
	}

	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public void off_edi_flg(boolean value) {
		setConstBoolean(offset + 12, $off_edi_flg, value);
	}


	/**
	 * Billing month FROM 請求年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate bill_cl_ym_from() {
		return getConstDate(offset + 13, $bill_cl_ym_from);
	}

	/**
	 * Billing month FROM 請求年月ＦＲＯＭ.<p>
	 *
	 */
	public void bill_cl_ym_from(MCDate value) {
		setConstDate(offset + 13, $bill_cl_ym_from, value);
	}


	/**
	 * Billing month TO 請求年月ＴＯ.<p>
	 *
	 */
	public MCDate bill_cl_ym_to() {
		return getConstDate(offset + 14, $bill_cl_ym_to);
	}

	/**
	 * Billing month TO 請求年月ＴＯ.<p>
	 *
	 */
	public void bill_cl_ym_to(MCDate value) {
		setConstDate(offset + 14, $bill_cl_ym_to, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 15, $bill_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 15, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 15, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 15, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 15, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 15, $bill_cl_day, value);
	}


	/**
	 * Scheduled payment receipt date FROM 入金予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rcv_schd_dt_from() {
		return getConstDate(offset + 16, $rcv_schd_dt_from);
	}

	/**
	 * Scheduled payment receipt date FROM 入金予定日ＦＲＯＭ.<p>
	 *
	 */
	public void rcv_schd_dt_from(MCDate value) {
		setConstDate(offset + 16, $rcv_schd_dt_from, value);
	}


	/**
	 * Scheduled payment receipt date TO 入金予定日ＴＯ.<p>
	 *
	 */
	public MCDate rcv_schd_dt_to() {
		return getConstDate(offset + 17, $rcv_schd_dt_to);
	}

	/**
	 * Scheduled payment receipt date TO 入金予定日ＴＯ.<p>
	 *
	 */
	public void rcv_schd_dt_to(MCDate value) {
		setConstDate(offset + 17, $rcv_schd_dt_to, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 18, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 18, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 19, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 19, $bill_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 20, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 20, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 21, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 21, $wg_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 22, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 22, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 23, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 23, $bcst_nm, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 24, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 24, $bill_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 25, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 25, $iv_no, value);
	}


	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 26, $pre_bill_no);
	}

	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 26, $pre_bill_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 27, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 27, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 28, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 28, $trd_cur_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrkno_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 29, $wrkno_p);
	}
	
	public void wrkno_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 29, $wrkno_p, row);
	}


	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public boolean inc_no_bill_flg() {
		return getConstBoolean(offset + 30, $inc_no_bill_flg);
	}

	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public void inc_no_bill_flg(boolean value) {
		setConstBoolean(offset + 30, $inc_no_bill_flg, value);
	}


	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 31, $interim_flg);
	}

	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 31, $interim_flg, value);
	}


	/**
	 * Exclude not to issue 発行対象外を除く.<p>
	 *
	 */
	public boolean not_prnt_ex_flg() {
		return getConstBoolean(offset + 32, $not_prnt_ex_flg);
	}

	/**
	 * Exclude not to issue 発行対象外を除く.<p>
	 *
	 */
	public void not_prnt_ex_flg(boolean value) {
		setConstBoolean(offset + 32, $not_prnt_ex_flg, value);
	}


	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public boolean rcv_schd_adjst_flg() {
		return getConstBoolean(offset + 33, $rcv_schd_adjst_flg);
	}

	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public void rcv_schd_adjst_flg(boolean value) {
		setConstBoolean(offset + 33, $rcv_schd_adjst_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR billGrp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 34, $billGrp_p);
	}
	
	public void billGrp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 34, $billGrp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_cl_ym_from.equalsIgnoreCase(name)) {
			return bill_cl_ym_from();
		}
		if ($bill_cl_ym_to.equalsIgnoreCase(name)) {
			return bill_cl_ym_to();
		}
		if ($rcv_schd_dt_from.equalsIgnoreCase(name)) {
			return rcv_schd_dt_from();
		}
		if ($rcv_schd_dt_to.equalsIgnoreCase(name)) {
			return rcv_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_cl_flg.equalsIgnoreCase(name)) {
			return not_cl_flg();
		}
		if ($cl_batch_flg.equalsIgnoreCase(name)) {
			return cl_batch_flg();
		}
		if ($cl_scrn_flg.equalsIgnoreCase(name)) {
			return cl_scrn_flg();
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			return each_sls_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($dmstic_flg.equalsIgnoreCase(name)) {
			return dmstic_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			return not_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		if ($inc_no_bill_flg.equalsIgnoreCase(name)) {
			return inc_no_bill_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($not_prnt_ex_flg.equalsIgnoreCase(name)) {
			return not_prnt_ex_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_cl_ym_from.equalsIgnoreCase(name)) {
			return bill_cl_ym_from();
		}
		if ($bill_cl_ym_to.equalsIgnoreCase(name)) {
			return bill_cl_ym_to();
		}
		if ($rcv_schd_dt_from.equalsIgnoreCase(name)) {
			return rcv_schd_dt_from();
		}
		if ($rcv_schd_dt_to.equalsIgnoreCase(name)) {
			return rcv_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_cl_flg.equalsIgnoreCase(name)) {
			return not_cl_flg();
		}
		if ($cl_batch_flg.equalsIgnoreCase(name)) {
			return cl_batch_flg();
		}
		if ($cl_scrn_flg.equalsIgnoreCase(name)) {
			return cl_scrn_flg();
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			return each_sls_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($dmstic_flg.equalsIgnoreCase(name)) {
			return dmstic_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			return not_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		if ($inc_no_bill_flg.equalsIgnoreCase(name)) {
			return inc_no_bill_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($not_prnt_ex_flg.equalsIgnoreCase(name)) {
			return not_prnt_ex_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_cl_ym_from.equalsIgnoreCase(name)) {
			bill_cl_ym_from(value);
			return;
		}
		if ($bill_cl_ym_to.equalsIgnoreCase(name)) {
			bill_cl_ym_to(value);
			return;
		}
		if ($rcv_schd_dt_from.equalsIgnoreCase(name)) {
			rcv_schd_dt_from(value);
			return;
		}
		if ($rcv_schd_dt_to.equalsIgnoreCase(name)) {
			rcv_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_cl_flg.equalsIgnoreCase(name)) {
			not_cl_flg(value);
			return;
		}
		if ($cl_batch_flg.equalsIgnoreCase(name)) {
			cl_batch_flg(value);
			return;
		}
		if ($cl_scrn_flg.equalsIgnoreCase(name)) {
			cl_scrn_flg(value);
			return;
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			each_sls_flg(value);
			return;
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			not_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($dmstic_flg.equalsIgnoreCase(name)) {
			dmstic_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			not_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		if ($inc_no_bill_flg.equalsIgnoreCase(name)) {
			inc_no_bill_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($not_prnt_ex_flg.equalsIgnoreCase(name)) {
			not_prnt_ex_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_ym_from.equalsIgnoreCase(name)) {
			bill_cl_ym_from(value);
			return;
		}
		if ($bill_cl_ym_to.equalsIgnoreCase(name)) {
			bill_cl_ym_to(value);
			return;
		}
		if ($rcv_schd_dt_from.equalsIgnoreCase(name)) {
			rcv_schd_dt_from(value);
			return;
		}
		if ($rcv_schd_dt_to.equalsIgnoreCase(name)) {
			rcv_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_cl_flg.equalsIgnoreCase(name)) {
			not_cl_flg(value);
			return;
		}
		if ($cl_batch_flg.equalsIgnoreCase(name)) {
			cl_batch_flg(value);
			return;
		}
		if ($cl_scrn_flg.equalsIgnoreCase(name)) {
			cl_scrn_flg(value);
			return;
		}
		if ($each_sls_flg.equalsIgnoreCase(name)) {
			each_sls_flg(value);
			return;
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			not_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($dmstic_flg.equalsIgnoreCase(name)) {
			dmstic_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			not_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		if ($inc_no_bill_flg.equalsIgnoreCase(name)) {
			inc_no_bill_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($not_prnt_ex_flg.equalsIgnoreCase(name)) {
			not_prnt_ex_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrkno_p.equalsIgnoreCase(name)) {
			return wrkno_p();
		}
		if ($billGrp_p.equalsIgnoreCase(name)) {
			return billGrp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrkno_p.equalsIgnoreCase(name)) {
			wrkno_p(
				((MCContainerMeta) wrkno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($billGrp_p.equalsIgnoreCase(name)) {
			billGrp_p(
				((MCContainerMeta) billGrp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return wrkno_p().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		wrkno_p().wrk_no(value);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return wrkno_p().wrk_nm();
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		wrkno_p().wrk_nm(value);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return billGrp_p().bp_grp_flg1();
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		billGrp_p().bp_grp_flg1(value);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return billGrp_p().bp_grp_cd1();
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		billGrp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return billGrp_p().bp_grp_nm1();
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		billGrp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return billGrp_p().bp_grp_flg2();
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		billGrp_p().bp_grp_flg2(value);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return billGrp_p().bp_grp_cd2();
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		billGrp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return billGrp_p().bp_grp_nm2();
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		billGrp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return billGrp_p().bp_grp_flg3();
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		billGrp_p().bp_grp_flg3(value);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return billGrp_p().bp_grp_cd3();
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		billGrp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return billGrp_p().bp_grp_nm3();
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		billGrp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return billGrp_p().bp_grp_flg4();
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		billGrp_p().bp_grp_flg4(value);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return billGrp_p().bp_grp_cd4();
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		billGrp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return billGrp_p().bp_grp_nm4();
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		billGrp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return billGrp_p().bp_grp_flg5();
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		billGrp_p().bp_grp_flg5(value);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return billGrp_p().bp_grp_cd5();
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		billGrp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return billGrp_p().bp_grp_nm5();
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		billGrp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return billGrp_p().bp_grp_flg6();
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		billGrp_p().bp_grp_flg6(value);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return billGrp_p().bp_grp_cd6();
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		billGrp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return billGrp_p().bp_grp_nm6();
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		billGrp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return billGrp_p().bp_grp_flg7();
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		billGrp_p().bp_grp_flg7(value);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return billGrp_p().bp_grp_cd7();
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		billGrp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return billGrp_p().bp_grp_nm7();
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		billGrp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return billGrp_p().bp_grp_flg8();
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		billGrp_p().bp_grp_flg8(value);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return billGrp_p().bp_grp_cd8();
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		billGrp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return billGrp_p().bp_grp_nm8();
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		billGrp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return billGrp_p().bp_grp_flg9();
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		billGrp_p().bp_grp_flg9(value);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return billGrp_p().bp_grp_cd9();
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		billGrp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return billGrp_p().bp_grp_nm9();
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		billGrp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return billGrp_p().bp_grp_flg10();
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		billGrp_p().bp_grp_flg10(value);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return billGrp_p().bp_grp_cd10();
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		billGrp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return billGrp_p().bp_grp_nm10();
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		billGrp_p().bp_grp_nm10(value);
	}

}

