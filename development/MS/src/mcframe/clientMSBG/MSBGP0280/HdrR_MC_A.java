package mcframe.clientMSBG.MSBGP0280;

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
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public static final String $cred_nm = "cred_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	public static final String $cred_limit_p = "cred_limit_p";
	public static final String $ttl_cred_amt_p = "ttl_cred_amt_p";
	public static final String $cred_bal_p = "cred_bal_p";
	/**
	 * Exclude order backlog 除受注残.<p>
	 *
	 */
	public static final String $exc_backord_flg = "exc_backord_flg";
	/**
	 * Include remaining quotation 含見積残.<p>
	 *
	 */
	public static final String $inc_qtn_flg = "inc_qtn_flg";
	/**
	 * Exclude remaining PO 除発注残.<p>
	 *
	 */
	public static final String $exc_po_backord_flg = "exc_po_backord_flg";
	/**
	 * Current month 当月.<p>
	 *
	 */
	public static final String $ttl_ym = "ttl_ym";
	/**
	 * Current month (AP) 当月（買掛）.<p>
	 *
	 */
	public static final String $ttl_ym_ap = "ttl_ym_ap";
	public static final String $ttl_end_bal_p = "ttl_end_bal_p";
	public static final String $ttl_init_bal_p = "ttl_init_bal_p";
	public static final String $ttl_sls_p = "ttl_sls_p";
	public static final String $ttl_rcv_p = "ttl_rcv_p";
	public static final String $ttl_adv_p = "ttl_adv_p";
	public static final String $ttl_init_bal_ap_p = "ttl_init_bal_ap_p";
	public static final String $ttl_purc_p = "ttl_purc_p";
	public static final String $ttl_pay_p = "ttl_pay_p";
	public static final String $ttl_adv_pay_p = "ttl_adv_pay_p";
	public static final String $not_appl_note_p = "not_appl_note_p";
	public static final String $not_appl_adv_note_p = "not_appl_adv_note_p";
	public static final String $ttl_backord_p = "ttl_backord_p";
	public static final String $ttl_qtn_p = "ttl_qtn_p";
	public static final String $ttl_po_backord_p = "ttl_po_backord_p";

	public static final String $cred_limit = $cred_limit_p + ".amt";
	public static final String $ttl_cred_amt = $ttl_cred_amt_p + ".amt";
	public static final String $cred_bal = $cred_bal_p + ".amt";
	public static final String $ttl_end_bal = $ttl_end_bal_p + ".amt";
	public static final String $ttl_init_bal = $ttl_init_bal_p + ".amt";
	public static final String $ttl_sls = $ttl_sls_p + ".amt";
	public static final String $ttl_rcv = $ttl_rcv_p + ".amt";
	public static final String $ttl_adv = $ttl_adv_p + ".amt";
	public static final String $ttl_init_bal_ap = $ttl_init_bal_ap_p + ".amt";
	public static final String $ttl_purc = $ttl_purc_p + ".amt";
	public static final String $ttl_pay = $ttl_pay_p + ".amt";
	public static final String $ttl_adv_pay = $ttl_adv_pay_p + ".amt";
	public static final String $not_appl_note = $not_appl_note_p + ".amt";
	public static final String $not_appl_adv_note = $not_appl_adv_note_p + ".amt";
	public static final String $ttl_backord = $ttl_backord_p + ".amt";
	public static final String $ttl_qtn = $ttl_qtn_p + ".amt";
	public static final String $ttl_po_backord = $ttl_po_backord_p + ".amt";

	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_nm_META = createCommonMeta($cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cred_limit_p_META = createInnerRowMeta($cred_limit_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_cred_amt_p_META = createInnerRowMeta($ttl_cred_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta cred_bal_p_META = createInnerRowMeta($cred_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta exc_backord_flg_META = createCommonMeta($exc_backord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_qtn_flg_META = createCommonMeta($inc_qtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta exc_po_backord_flg_META = createCommonMeta($exc_po_backord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ttl_ym_META = createCommonMeta($ttl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ttl_ym_ap_META = createCommonMeta($ttl_ym_ap, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ttl_end_bal_p_META = createInnerRowMeta($ttl_end_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_init_bal_p_META = createInnerRowMeta($ttl_init_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_sls_p_META = createInnerRowMeta($ttl_sls_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_rcv_p_META = createInnerRowMeta($ttl_rcv_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_adv_p_META = createInnerRowMeta($ttl_adv_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_init_bal_ap_p_META = createInnerRowMeta($ttl_init_bal_ap_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_purc_p_META = createInnerRowMeta($ttl_purc_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_pay_p_META = createInnerRowMeta($ttl_pay_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_adv_pay_p_META = createInnerRowMeta($ttl_adv_pay_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta not_appl_note_p_META = createInnerRowMeta($not_appl_note_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta not_appl_adv_note_p_META = createInnerRowMeta($not_appl_adv_note_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_backord_p_META = createInnerRowMeta($ttl_backord_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_qtn_p_META = createInnerRowMeta($ttl_qtn_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_po_backord_p_META = createInnerRowMeta($ttl_po_backord_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cred_cd_META,
			cred_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			cred_limit_p_META,
			ttl_cred_amt_p_META,
			cred_bal_p_META,
			exc_backord_flg_META,
			inc_qtn_flg_META,
			exc_po_backord_flg_META,
			ttl_ym_META,
			ttl_ym_ap_META,
			ttl_end_bal_p_META,
			ttl_init_bal_p_META,
			ttl_sls_p_META,
			ttl_rcv_p_META,
			ttl_adv_p_META,
			ttl_init_bal_ap_p_META,
			ttl_purc_p_META,
			ttl_pay_p_META,
			ttl_adv_pay_p_META,
			not_appl_note_p_META,
			not_appl_adv_note_p_META,
			ttl_backord_p_META,
			ttl_qtn_p_META,
			ttl_po_backord_p_META
		},
		new String[][]{
			{
				"cred_limit",
				"ttl_cred_amt",
				"cred_bal",
				"ttl_end_bal",
				"ttl_init_bal",
				"ttl_sls",
				"ttl_rcv",
				"ttl_adv",
				"ttl_init_bal_ap",
				"ttl_purc",
				"ttl_pay",
				"ttl_adv_pay",
				"not_appl_note",
				"not_appl_adv_note",
				"ttl_backord",
				"ttl_qtn",
				"ttl_po_backord"
			},
			{
				$cred_limit,
				$ttl_cred_amt,
				$cred_bal,
				$ttl_end_bal,
				$ttl_init_bal,
				$ttl_sls,
				$ttl_rcv,
				$ttl_adv,
				$ttl_init_bal_ap,
				$ttl_purc,
				$ttl_pay,
				$ttl_adv_pay,
				$not_appl_note,
				$not_appl_adv_note,
				$ttl_backord,
				$ttl_qtn,
				$ttl_po_backord
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
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 0, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 0, $cred_cd, value);
	}


	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public String cred_nm() {
		return getConstString(offset + 1, $cred_nm);
	}

	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public void cred_nm(String value) {
		setConstString(offset + 1, $cred_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 2, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 2, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 3, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 3, $cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 4, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR cred_limit_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 5, $cred_limit_p);
	}
	
	public void cred_limit_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 5, $cred_limit_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_cred_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 6, $ttl_cred_amt_p);
	}
	
	public void ttl_cred_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 6, $ttl_cred_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR cred_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 7, $cred_bal_p);
	}
	
	public void cred_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 7, $cred_bal_p, row);
	}


	/**
	 * Exclude order backlog 除受注残.<p>
	 *
	 */
	public boolean exc_backord_flg() {
		return getConstBoolean(offset + 8, $exc_backord_flg);
	}

	/**
	 * Exclude order backlog 除受注残.<p>
	 *
	 */
	public void exc_backord_flg(boolean value) {
		setConstBoolean(offset + 8, $exc_backord_flg, value);
	}


	/**
	 * Include remaining quotation 含見積残.<p>
	 *
	 */
	public boolean inc_qtn_flg() {
		return getConstBoolean(offset + 9, $inc_qtn_flg);
	}

	/**
	 * Include remaining quotation 含見積残.<p>
	 *
	 */
	public void inc_qtn_flg(boolean value) {
		setConstBoolean(offset + 9, $inc_qtn_flg, value);
	}


	/**
	 * Exclude remaining PO 除発注残.<p>
	 *
	 */
	public boolean exc_po_backord_flg() {
		return getConstBoolean(offset + 10, $exc_po_backord_flg);
	}

	/**
	 * Exclude remaining PO 除発注残.<p>
	 *
	 */
	public void exc_po_backord_flg(boolean value) {
		setConstBoolean(offset + 10, $exc_po_backord_flg, value);
	}


	/**
	 * Current month 当月.<p>
	 *
	 */
	public MCDate ttl_ym() {
		return getConstDate(offset + 11, $ttl_ym);
	}

	/**
	 * Current month 当月.<p>
	 *
	 */
	public void ttl_ym(MCDate value) {
		setConstDate(offset + 11, $ttl_ym, value);
	}


	/**
	 * Current month (AP) 当月（買掛）.<p>
	 *
	 */
	public MCDate ttl_ym_ap() {
		return getConstDate(offset + 12, $ttl_ym_ap);
	}

	/**
	 * Current month (AP) 当月（買掛）.<p>
	 *
	 */
	public void ttl_ym_ap(MCDate value) {
		setConstDate(offset + 12, $ttl_ym_ap, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_end_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 13, $ttl_end_bal_p);
	}
	
	public void ttl_end_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 13, $ttl_end_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_init_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 14, $ttl_init_bal_p);
	}
	
	public void ttl_init_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 14, $ttl_init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_sls_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 15, $ttl_sls_p);
	}
	
	public void ttl_sls_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 15, $ttl_sls_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_rcv_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 16, $ttl_rcv_p);
	}
	
	public void ttl_rcv_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 16, $ttl_rcv_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_adv_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 17, $ttl_adv_p);
	}
	
	public void ttl_adv_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 17, $ttl_adv_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_init_bal_ap_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 18, $ttl_init_bal_ap_p);
	}
	
	public void ttl_init_bal_ap_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 18, $ttl_init_bal_ap_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_purc_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 19, $ttl_purc_p);
	}
	
	public void ttl_purc_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 19, $ttl_purc_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_pay_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 20, $ttl_pay_p);
	}
	
	public void ttl_pay_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 20, $ttl_pay_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_adv_pay_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 21, $ttl_adv_pay_p);
	}
	
	public void ttl_adv_pay_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 21, $ttl_adv_pay_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR not_appl_note_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 22, $not_appl_note_p);
	}
	
	public void not_appl_note_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 22, $not_appl_note_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR not_appl_adv_note_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 23, $not_appl_adv_note_p);
	}
	
	public void not_appl_adv_note_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 23, $not_appl_adv_note_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_backord_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 24, $ttl_backord_p);
	}
	
	public void ttl_backord_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 24, $ttl_backord_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_qtn_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 25, $ttl_qtn_p);
	}
	
	public void ttl_qtn_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 25, $ttl_qtn_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_po_backord_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 26, $ttl_po_backord_p);
	}
	
	public void ttl_po_backord_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 26, $ttl_po_backord_p, row);
	}


	public String getString(String name) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			return ttl_ym();
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			return ttl_ym_ap();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($exc_backord_flg.equalsIgnoreCase(name)) {
			return exc_backord_flg();
		}
		if ($inc_qtn_flg.equalsIgnoreCase(name)) {
			return inc_qtn_flg();
		}
		if ($exc_po_backord_flg.equalsIgnoreCase(name)) {
			return exc_po_backord_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			return ttl_ym();
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			return ttl_ym_ap();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($exc_backord_flg.equalsIgnoreCase(name)) {
			return exc_backord_flg();
		}
		if ($inc_qtn_flg.equalsIgnoreCase(name)) {
			return inc_qtn_flg();
		}
		if ($exc_po_backord_flg.equalsIgnoreCase(name)) {
			return exc_po_backord_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			ttl_ym(value);
			return;
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			ttl_ym_ap(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($exc_backord_flg.equalsIgnoreCase(name)) {
			exc_backord_flg(value);
			return;
		}
		if ($inc_qtn_flg.equalsIgnoreCase(name)) {
			inc_qtn_flg(value);
			return;
		}
		if ($exc_po_backord_flg.equalsIgnoreCase(name)) {
			exc_po_backord_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			ttl_ym(value);
			return;
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			ttl_ym_ap(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($exc_backord_flg.equalsIgnoreCase(name)) {
			exc_backord_flg(value);
			return;
		}
		if ($inc_qtn_flg.equalsIgnoreCase(name)) {
			inc_qtn_flg(value);
			return;
		}
		if ($exc_po_backord_flg.equalsIgnoreCase(name)) {
			exc_po_backord_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($cred_limit_p.equalsIgnoreCase(name)) {
			return cred_limit_p();
		}
		if ($ttl_cred_amt_p.equalsIgnoreCase(name)) {
			return ttl_cred_amt_p();
		}
		if ($cred_bal_p.equalsIgnoreCase(name)) {
			return cred_bal_p();
		}
		if ($ttl_end_bal_p.equalsIgnoreCase(name)) {
			return ttl_end_bal_p();
		}
		if ($ttl_init_bal_p.equalsIgnoreCase(name)) {
			return ttl_init_bal_p();
		}
		if ($ttl_sls_p.equalsIgnoreCase(name)) {
			return ttl_sls_p();
		}
		if ($ttl_rcv_p.equalsIgnoreCase(name)) {
			return ttl_rcv_p();
		}
		if ($ttl_adv_p.equalsIgnoreCase(name)) {
			return ttl_adv_p();
		}
		if ($ttl_init_bal_ap_p.equalsIgnoreCase(name)) {
			return ttl_init_bal_ap_p();
		}
		if ($ttl_purc_p.equalsIgnoreCase(name)) {
			return ttl_purc_p();
		}
		if ($ttl_pay_p.equalsIgnoreCase(name)) {
			return ttl_pay_p();
		}
		if ($ttl_adv_pay_p.equalsIgnoreCase(name)) {
			return ttl_adv_pay_p();
		}
		if ($not_appl_note_p.equalsIgnoreCase(name)) {
			return not_appl_note_p();
		}
		if ($not_appl_adv_note_p.equalsIgnoreCase(name)) {
			return not_appl_adv_note_p();
		}
		if ($ttl_backord_p.equalsIgnoreCase(name)) {
			return ttl_backord_p();
		}
		if ($ttl_qtn_p.equalsIgnoreCase(name)) {
			return ttl_qtn_p();
		}
		if ($ttl_po_backord_p.equalsIgnoreCase(name)) {
			return ttl_po_backord_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($cred_limit_p.equalsIgnoreCase(name)) {
			cred_limit_p(
				((MCContainerMeta) cred_limit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_cred_amt_p.equalsIgnoreCase(name)) {
			ttl_cred_amt_p(
				((MCContainerMeta) ttl_cred_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($cred_bal_p.equalsIgnoreCase(name)) {
			cred_bal_p(
				((MCContainerMeta) cred_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_end_bal_p.equalsIgnoreCase(name)) {
			ttl_end_bal_p(
				((MCContainerMeta) ttl_end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_init_bal_p.equalsIgnoreCase(name)) {
			ttl_init_bal_p(
				((MCContainerMeta) ttl_init_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_sls_p.equalsIgnoreCase(name)) {
			ttl_sls_p(
				((MCContainerMeta) ttl_sls_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_rcv_p.equalsIgnoreCase(name)) {
			ttl_rcv_p(
				((MCContainerMeta) ttl_rcv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_adv_p.equalsIgnoreCase(name)) {
			ttl_adv_p(
				((MCContainerMeta) ttl_adv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_init_bal_ap_p.equalsIgnoreCase(name)) {
			ttl_init_bal_ap_p(
				((MCContainerMeta) ttl_init_bal_ap_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_purc_p.equalsIgnoreCase(name)) {
			ttl_purc_p(
				((MCContainerMeta) ttl_purc_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_pay_p.equalsIgnoreCase(name)) {
			ttl_pay_p(
				((MCContainerMeta) ttl_pay_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_adv_pay_p.equalsIgnoreCase(name)) {
			ttl_adv_pay_p(
				((MCContainerMeta) ttl_adv_pay_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($not_appl_note_p.equalsIgnoreCase(name)) {
			not_appl_note_p(
				((MCContainerMeta) not_appl_note_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($not_appl_adv_note_p.equalsIgnoreCase(name)) {
			not_appl_adv_note_p(
				((MCContainerMeta) not_appl_adv_note_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_backord_p.equalsIgnoreCase(name)) {
			ttl_backord_p(
				((MCContainerMeta) ttl_backord_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_qtn_p.equalsIgnoreCase(name)) {
			ttl_qtn_p(
				((MCContainerMeta) ttl_qtn_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_po_backord_p.equalsIgnoreCase(name)) {
			ttl_po_backord_p(
				((MCContainerMeta) ttl_po_backord_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public MCNumber cred_limit() {
		return cred_limit_p().amt();
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(MCNumber value) {
		cred_limit_p().amt(value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(int value) {
		cred_limit_p().amt(value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(long value) {
		cred_limit_p().amt(value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(float value) {
		cred_limit_p().amt(value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(double value) {
		cred_limit_p().amt(value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public MCNumber ttl_cred_amt() {
		return ttl_cred_amt_p().amt();
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(MCNumber value) {
		ttl_cred_amt_p().amt(value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(int value) {
		ttl_cred_amt_p().amt(value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(long value) {
		ttl_cred_amt_p().amt(value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(float value) {
		ttl_cred_amt_p().amt(value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(double value) {
		ttl_cred_amt_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public MCNumber cred_bal() {
		return cred_bal_p().amt();
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(MCNumber value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(int value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(long value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(float value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(double value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public MCNumber ttl_end_bal() {
		return ttl_end_bal_p().amt();
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(MCNumber value) {
		ttl_end_bal_p().amt(value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(int value) {
		ttl_end_bal_p().amt(value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(long value) {
		ttl_end_bal_p().amt(value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(float value) {
		ttl_end_bal_p().amt(value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(double value) {
		ttl_end_bal_p().amt(value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public MCNumber ttl_init_bal() {
		return ttl_init_bal_p().amt();
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(MCNumber value) {
		ttl_init_bal_p().amt(value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(int value) {
		ttl_init_bal_p().amt(value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(long value) {
		ttl_init_bal_p().amt(value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(float value) {
		ttl_init_bal_p().amt(value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(double value) {
		ttl_init_bal_p().amt(value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public MCNumber ttl_sls() {
		return ttl_sls_p().amt();
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(MCNumber value) {
		ttl_sls_p().amt(value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(int value) {
		ttl_sls_p().amt(value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(long value) {
		ttl_sls_p().amt(value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(float value) {
		ttl_sls_p().amt(value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(double value) {
		ttl_sls_p().amt(value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public MCNumber ttl_rcv() {
		return ttl_rcv_p().amt();
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(MCNumber value) {
		ttl_rcv_p().amt(value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(int value) {
		ttl_rcv_p().amt(value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(long value) {
		ttl_rcv_p().amt(value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(float value) {
		ttl_rcv_p().amt(value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(double value) {
		ttl_rcv_p().amt(value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public MCNumber ttl_adv() {
		return ttl_adv_p().amt();
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(MCNumber value) {
		ttl_adv_p().amt(value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(int value) {
		ttl_adv_p().amt(value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(long value) {
		ttl_adv_p().amt(value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(float value) {
		ttl_adv_p().amt(value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(double value) {
		ttl_adv_p().amt(value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public MCNumber ttl_init_bal_ap() {
		return ttl_init_bal_ap_p().amt();
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(MCNumber value) {
		ttl_init_bal_ap_p().amt(value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(int value) {
		ttl_init_bal_ap_p().amt(value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(long value) {
		ttl_init_bal_ap_p().amt(value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(float value) {
		ttl_init_bal_ap_p().amt(value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(double value) {
		ttl_init_bal_ap_p().amt(value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public MCNumber ttl_purc() {
		return ttl_purc_p().amt();
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(MCNumber value) {
		ttl_purc_p().amt(value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(int value) {
		ttl_purc_p().amt(value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(long value) {
		ttl_purc_p().amt(value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(float value) {
		ttl_purc_p().amt(value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(double value) {
		ttl_purc_p().amt(value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public MCNumber ttl_pay() {
		return ttl_pay_p().amt();
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(MCNumber value) {
		ttl_pay_p().amt(value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(int value) {
		ttl_pay_p().amt(value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(long value) {
		ttl_pay_p().amt(value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(float value) {
		ttl_pay_p().amt(value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(double value) {
		ttl_pay_p().amt(value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public MCNumber ttl_adv_pay() {
		return ttl_adv_pay_p().amt();
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(MCNumber value) {
		ttl_adv_pay_p().amt(value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(int value) {
		ttl_adv_pay_p().amt(value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(long value) {
		ttl_adv_pay_p().amt(value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(float value) {
		ttl_adv_pay_p().amt(value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(double value) {
		ttl_adv_pay_p().amt(value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public MCNumber not_appl_note() {
		return not_appl_note_p().amt();
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(MCNumber value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(int value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(long value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(float value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(double value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public MCNumber not_appl_adv_note() {
		return not_appl_adv_note_p().amt();
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(MCNumber value) {
		not_appl_adv_note_p().amt(value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(int value) {
		not_appl_adv_note_p().amt(value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(long value) {
		not_appl_adv_note_p().amt(value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(float value) {
		not_appl_adv_note_p().amt(value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(double value) {
		not_appl_adv_note_p().amt(value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public MCNumber ttl_backord() {
		return ttl_backord_p().amt();
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(MCNumber value) {
		ttl_backord_p().amt(value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(int value) {
		ttl_backord_p().amt(value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(long value) {
		ttl_backord_p().amt(value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(float value) {
		ttl_backord_p().amt(value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(double value) {
		ttl_backord_p().amt(value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public MCNumber ttl_qtn() {
		return ttl_qtn_p().amt();
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(MCNumber value) {
		ttl_qtn_p().amt(value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(int value) {
		ttl_qtn_p().amt(value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(long value) {
		ttl_qtn_p().amt(value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(float value) {
		ttl_qtn_p().amt(value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(double value) {
		ttl_qtn_p().amt(value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public MCNumber ttl_po_backord() {
		return ttl_po_backord_p().amt();
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(MCNumber value) {
		ttl_po_backord_p().amt(value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(int value) {
		ttl_po_backord_p().amt(value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(long value) {
		ttl_po_backord_p().amt(value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(float value) {
		ttl_po_backord_p().amt(value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(double value) {
		ttl_po_backord_p().amt(value);
	}

}

