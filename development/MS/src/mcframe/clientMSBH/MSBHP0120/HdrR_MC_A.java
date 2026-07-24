package mcframe.clientMSBH.MSBHP0120;

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
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
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
	 * AP type 債務区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public static final String $ap_typ_nm = "ap_typ_nm";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
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
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	public static final String $wrkno_p = "wrkno_p";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	public static final String $init_bal_p = "init_bal_p";
	public static final String $purc_amt_p = "purc_amt_p";
	public static final String $ret_amt_p = "ret_amt_p";
	public static final String $dscnt_amt_p = "dscnt_amt_p";
	public static final String $sw_to_amt_p = "sw_to_amt_p";
	public static final String $tax_amt_p = "tax_amt_p";
	public static final String $cash_amt_p = "cash_amt_p";
	public static final String $note_amt_p = "note_amt_p";
	public static final String $account_amt_p = "account_amt_p";
	public static final String $setoff_amt_p = "setoff_amt_p";
	public static final String $sw_amt_p = "sw_amt_p";
	public static final String $end_bal_p = "end_bal_p";
	public static final String $exc_gain_loss_p = "exc_gain_loss_p";

	public static final String $wrk_no = $wrkno_p + ".wrk_no";
	public static final String $wrk_nm = $wrkno_p + ".wrk_nm";
	public static final String $init_bal = $init_bal_p + ".amt";
	public static final String $purc_amt = $purc_amt_p + ".amt";
	public static final String $ret_amt = $ret_amt_p + ".amt";
	public static final String $dscnt_amt = $dscnt_amt_p + ".amt";
	public static final String $sw_to_amt = $sw_to_amt_p + ".amt";
	public static final String $tax_amt = $tax_amt_p + ".amt";
	public static final String $cash_amt = $cash_amt_p + ".amt";
	public static final String $note_amt = $note_amt_p + ".amt";
	public static final String $account_amt = $account_amt_p + ".amt";
	public static final String $setoff_amt = $setoff_amt_p + ".amt";
	public static final String $sw_amt = $sw_amt_p + ".amt";
	public static final String $end_bal = $end_bal_p + ".amt";
	public static final String $exc_gain_loss = $exc_gain_loss_p + ".amt";

	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta wrkno_p_META = createInnerRowMeta($wrkno_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta init_bal_p_META = createInnerRowMeta($init_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta purc_amt_p_META = createInnerRowMeta($purc_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ret_amt_p_META = createInnerRowMeta($ret_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta dscnt_amt_p_META = createInnerRowMeta($dscnt_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta sw_to_amt_p_META = createInnerRowMeta($sw_to_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta tax_amt_p_META = createInnerRowMeta($tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta cash_amt_p_META = createInnerRowMeta($cash_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta note_amt_p_META = createInnerRowMeta($note_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta account_amt_p_META = createInnerRowMeta($account_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta setoff_amt_p_META = createInnerRowMeta($setoff_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta sw_amt_p_META = createInnerRowMeta($sw_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta end_bal_p_META = createInnerRowMeta($end_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta exc_gain_loss_p_META = createInnerRowMeta($exc_gain_loss_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			ap_typ_META,
			ap_typ_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			purc_act_no_META,
			wrkno_p_META,
			cur_cd_META,
			amt_dec_place_META,
			upri_dec_place_META,
			base_cur_cd_META,
			base_cur_nm_META,
			init_bal_p_META,
			purc_amt_p_META,
			ret_amt_p_META,
			dscnt_amt_p_META,
			sw_to_amt_p_META,
			tax_amt_p_META,
			cash_amt_p_META,
			note_amt_p_META,
			account_amt_p_META,
			setoff_amt_p_META,
			sw_amt_p_META,
			end_bal_p_META,
			exc_gain_loss_p_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"init_bal",
				"purc_amt",
				"ret_amt",
				"dscnt_amt",
				"sw_to_amt",
				"tax_amt",
				"cash_amt",
				"note_amt",
				"account_amt",
				"setoff_amt",
				"sw_amt",
				"end_bal",
				"exc_gain_loss"
			},
			{
				$wrk_no,
				$wrk_nm,
				$init_bal,
				$purc_amt,
				$ret_amt,
				$dscnt_amt,
				$sw_to_amt,
				$tax_amt,
				$cash_amt,
				$note_amt,
				$account_amt,
				$setoff_amt,
				$sw_amt,
				$end_bal,
				$exc_gain_loss
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
				{$wg_nm, "WG"},	// wg_nm
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"}	// base_cur_nm
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
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 1, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 1, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 2, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 2, $trd_cur_nm, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 3, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 3, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 4, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 4, $ap_typ_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 5, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 5, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 6, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 6, $asppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 7, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 7, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 8, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 8, $ap_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 10, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 10, $wg_nm, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 11, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 11, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 12, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 12, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 13, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 13, $purc_act_no, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrkno_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 14, $wrkno_p);
	}
	
	public void wrkno_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 14, $wrkno_p, row);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 15, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 15, $cur_cd, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 16, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 16, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 16, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 16, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 16, $amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 17, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 18, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 18, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 19, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 19, $base_cur_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR init_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 20, $init_bal_p);
	}
	
	public void init_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 20, $init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR purc_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 21, $purc_amt_p);
	}
	
	public void purc_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 21, $purc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ret_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 22, $ret_amt_p);
	}
	
	public void ret_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 22, $ret_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 23, $dscnt_amt_p);
	}
	
	public void dscnt_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 23, $dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR sw_to_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 24, $sw_to_amt_p);
	}
	
	public void sw_to_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 24, $sw_to_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 25, $tax_amt_p);
	}
	
	public void tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 25, $tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR cash_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 26, $cash_amt_p);
	}
	
	public void cash_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 26, $cash_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR note_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 27, $note_amt_p);
	}
	
	public void note_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 27, $note_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR account_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 28, $account_amt_p);
	}
	
	public void account_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 28, $account_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR setoff_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 29, $setoff_amt_p);
	}
	
	public void setoff_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 29, $setoff_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR sw_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 30, $sw_amt_p);
	}
	
	public void sw_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 30, $sw_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR end_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 31, $end_bal_p);
	}
	
	public void end_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 31, $end_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR exc_gain_loss_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 32, $exc_gain_loss_p);
	}
	
	public void exc_gain_loss_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 32, $exc_gain_loss_p, row);
	}


	public String getString(String name) {
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrkno_p.equalsIgnoreCase(name)) {
			return wrkno_p();
		}
		if ($init_bal_p.equalsIgnoreCase(name)) {
			return init_bal_p();
		}
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			return purc_amt_p();
		}
		if ($ret_amt_p.equalsIgnoreCase(name)) {
			return ret_amt_p();
		}
		if ($dscnt_amt_p.equalsIgnoreCase(name)) {
			return dscnt_amt_p();
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			return sw_to_amt_p();
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			return tax_amt_p();
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			return cash_amt_p();
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			return note_amt_p();
		}
		if ($account_amt_p.equalsIgnoreCase(name)) {
			return account_amt_p();
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			return setoff_amt_p();
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			return sw_amt_p();
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			return end_bal_p();
		}
		if ($exc_gain_loss_p.equalsIgnoreCase(name)) {
			return exc_gain_loss_p();
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
		if ($init_bal_p.equalsIgnoreCase(name)) {
			init_bal_p(
				((MCContainerMeta) init_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			purc_amt_p(
				((MCContainerMeta) purc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ret_amt_p.equalsIgnoreCase(name)) {
			ret_amt_p(
				((MCContainerMeta) ret_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($dscnt_amt_p.equalsIgnoreCase(name)) {
			dscnt_amt_p(
				((MCContainerMeta) dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			sw_to_amt_p(
				((MCContainerMeta) sw_to_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			tax_amt_p(
				((MCContainerMeta) tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			cash_amt_p(
				((MCContainerMeta) cash_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			note_amt_p(
				((MCContainerMeta) note_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($account_amt_p.equalsIgnoreCase(name)) {
			account_amt_p(
				((MCContainerMeta) account_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			setoff_amt_p(
				((MCContainerMeta) setoff_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			sw_amt_p(
				((MCContainerMeta) sw_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			end_bal_p(
				((MCContainerMeta) end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($exc_gain_loss_p.equalsIgnoreCase(name)) {
			exc_gain_loss_p(
				((MCContainerMeta) exc_gain_loss_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrkno_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrkno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrkno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrkno_p().wrk_nm(value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return init_bal_p().amt();
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(int value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(long value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(float value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月末残高.<p>
	 *
	 */
	public void init_bal(double value) {
		init_bal_p().amt(value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return purc_amt_p().amt();
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount 仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return ret_amt_p().amt();
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return dscnt_amt_p().amt();
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount markup amount 値引値増額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return sw_to_amt_p().amt();
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount (Transfer destination) 振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return tax_amt_p().amt();
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return cash_amt_p().amt();
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(int value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(long value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(float value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount 現金支払額.<p>
	 *
	 */
	public void cash_amt(double value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return note_amt_p().amt();
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(int value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(long value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(float value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment amount 手形支払額.<p>
	 *
	 */
	public void note_amt(double value) {
		note_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public MCNumber account_amt() {
		return account_amt_p().amt();
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(MCNumber value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(int value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(long value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(float value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void account_amt(double value) {
		account_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoff_amt_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return sw_amt_p().amt();
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		sw_amt_p().amt(value);
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
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return exc_gain_loss_p().amt();
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		exc_gain_loss_p().amt(value);
	}

}

