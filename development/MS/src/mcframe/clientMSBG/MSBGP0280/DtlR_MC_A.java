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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

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
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	public static final String $init_bal_p = "init_bal_p";
	public static final String $sls_amt_p = "sls_amt_p";
	public static final String $cash_amt_p = "cash_amt_p";
	public static final String $note_amt_p = "note_amt_p";
	public static final String $xfr_amt_p = "xfr_amt_p";
	public static final String $setoff_amt_p = "setoff_amt_p";
	public static final String $sw_amt_p = "sw_amt_p";
	public static final String $end_bal_p = "end_bal_p";
	public static final String $not_appl_no_p = "not_appl_no_p";
	public static final String $backord_amt_p = "backord_amt_p";
	public static final String $cred_amt_p = "cred_amt_p";
	public static final String $qtn_amt_p = "qtn_amt_p";

	public static final String $init_bal = $init_bal_p + ".amt";
	public static final String $sls_amt = $sls_amt_p + ".amt";
	public static final String $cash_amt = $cash_amt_p + ".amt";
	public static final String $note_amt = $note_amt_p + ".amt";
	public static final String $xfr_amt = $xfr_amt_p + ".amt";
	public static final String $setoff_amt = $setoff_amt_p + ".amt";
	public static final String $sw_amt = $sw_amt_p + ".amt";
	public static final String $end_bal = $end_bal_p + ".amt";
	public static final String $not_appl_note = $not_appl_no_p + ".amt";
	public static final String $backord_amt = $backord_amt_p + ".amt";
	public static final String $cred_amt = $cred_amt_p + ".amt";
	public static final String $qtn_amt = $qtn_amt_p + ".amt";

	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta init_bal_p_META = createInnerRowMeta($init_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sls_amt_p_META = createInnerRowMeta($sls_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cash_amt_p_META = createInnerRowMeta($cash_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta note_amt_p_META = createInnerRowMeta($note_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_amt_p_META = createInnerRowMeta($xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_amt_p_META = createInnerRowMeta($setoff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_amt_p_META = createInnerRowMeta($sw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta end_bal_p_META = createInnerRowMeta($end_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta not_appl_no_p_META = createInnerRowMeta($not_appl_no_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta backord_amt_p_META = createInnerRowMeta($backord_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cred_amt_p_META = createInnerRowMeta($cred_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta qtn_amt_p_META = createInnerRowMeta($qtn_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			acst_cd_META,
			acst_nm_META,
			init_bal_p_META,
			sls_amt_p_META,
			cash_amt_p_META,
			note_amt_p_META,
			xfr_amt_p_META,
			setoff_amt_p_META,
			sw_amt_p_META,
			end_bal_p_META,
			not_appl_no_p_META,
			backord_amt_p_META,
			cred_amt_p_META,
			qtn_amt_p_META
		},
		new String[][]{
			{
				"init_bal",
				"sls_amt",
				"cash_amt",
				"note_amt",
				"xfr_amt",
				"setoff_amt",
				"sw_amt",
				"end_bal",
				"not_appl_note",
				"backord_amt",
				"cred_amt",
				"qtn_amt"
			},
			{
				$init_bal,
				$sls_amt,
				$cash_amt,
				$note_amt,
				$xfr_amt,
				$setoff_amt,
				$sw_amt,
				$end_bal,
				$not_appl_note,
				$backord_amt,
				$cred_amt,
				$qtn_amt
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
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
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 2, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 2, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 3, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 3, $acst_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR init_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 4, $init_bal_p);
	}
	
	public void init_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 4, $init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 5, $sls_amt_p);
	}
	
	public void sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 5, $sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR cash_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 6, $cash_amt_p);
	}
	
	public void cash_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 6, $cash_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR note_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 7, $note_amt_p);
	}
	
	public void note_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 7, $note_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 8, $xfr_amt_p);
	}
	
	public void xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 8, $xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoff_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 9, $setoff_amt_p);
	}
	
	public void setoff_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 9, $setoff_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sw_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 10, $sw_amt_p);
	}
	
	public void sw_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 10, $sw_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR end_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 11, $end_bal_p);
	}
	
	public void end_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 11, $end_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR not_appl_no_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 12, $not_appl_no_p);
	}
	
	public void not_appl_no_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 12, $not_appl_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR backord_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 13, $backord_amt_p);
	}
	
	public void backord_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 13, $backord_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR cred_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 14, $cred_amt_p);
	}
	
	public void cred_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 14, $cred_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR qtn_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 15, $qtn_amt_p);
	}
	
	public void qtn_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 15, $qtn_amt_p, row);
	}


	public String getString(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		return super.getStringNE(name);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		super.setString(name, value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($init_bal_p.equalsIgnoreCase(name)) {
			return init_bal_p();
		}
		if ($sls_amt_p.equalsIgnoreCase(name)) {
			return sls_amt_p();
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			return cash_amt_p();
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			return note_amt_p();
		}
		if ($xfr_amt_p.equalsIgnoreCase(name)) {
			return xfr_amt_p();
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
		if ($not_appl_no_p.equalsIgnoreCase(name)) {
			return not_appl_no_p();
		}
		if ($backord_amt_p.equalsIgnoreCase(name)) {
			return backord_amt_p();
		}
		if ($cred_amt_p.equalsIgnoreCase(name)) {
			return cred_amt_p();
		}
		if ($qtn_amt_p.equalsIgnoreCase(name)) {
			return qtn_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($init_bal_p.equalsIgnoreCase(name)) {
			init_bal_p(
				((MCContainerMeta) init_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sls_amt_p.equalsIgnoreCase(name)) {
			sls_amt_p(
				((MCContainerMeta) sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			cash_amt_p(
				((MCContainerMeta) cash_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			note_amt_p(
				((MCContainerMeta) note_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_amt_p.equalsIgnoreCase(name)) {
			xfr_amt_p(
				((MCContainerMeta) xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			setoff_amt_p(
				((MCContainerMeta) setoff_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			sw_amt_p(
				((MCContainerMeta) sw_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			end_bal_p(
				((MCContainerMeta) end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($not_appl_no_p.equalsIgnoreCase(name)) {
			not_appl_no_p(
				((MCContainerMeta) not_appl_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($backord_amt_p.equalsIgnoreCase(name)) {
			backord_amt_p(
				((MCContainerMeta) backord_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($cred_amt_p.equalsIgnoreCase(name)) {
			cred_amt_p(
				((MCContainerMeta) cred_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($qtn_amt_p.equalsIgnoreCase(name)) {
			qtn_amt_p(
				((MCContainerMeta) qtn_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return init_bal_p().amt();
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(int value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(long value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(float value) {
		init_bal_p().amt(value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(double value) {
		init_bal_p().amt(value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return sls_amt_p().amt();
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return cash_amt_p().amt();
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(int value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(long value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(float value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(double value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return note_amt_p().amt();
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(int value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(long value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(float value) {
		note_amt_p().amt(value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(double value) {
		note_amt_p().amt(value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public MCNumber xfr_amt() {
		return xfr_amt_p().amt();
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(int value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(long value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(float value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(double value) {
		xfr_amt_p().amt(value);
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
	 * AR amount 売掛金.<p>
	 *
	 */
	public MCNumber end_bal() {
		return end_bal_p().amt();
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		end_bal_p().amt(value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(int value) {
		end_bal_p().amt(value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(long value) {
		end_bal_p().amt(value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(float value) {
		end_bal_p().amt(value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(double value) {
		end_bal_p().amt(value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public MCNumber not_appl_note() {
		return not_appl_no_p().amt();
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(MCNumber value) {
		not_appl_no_p().amt(value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(int value) {
		not_appl_no_p().amt(value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(long value) {
		not_appl_no_p().amt(value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(float value) {
		not_appl_no_p().amt(value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(double value) {
		not_appl_no_p().amt(value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCNumber backord_amt() {
		return backord_amt_p().amt();
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(MCNumber value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(int value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(long value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(float value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(double value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public MCNumber cred_amt() {
		return cred_amt_p().amt();
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(MCNumber value) {
		cred_amt_p().amt(value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(int value) {
		cred_amt_p().amt(value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(long value) {
		cred_amt_p().amt(value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(float value) {
		cred_amt_p().amt(value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(double value) {
		cred_amt_p().amt(value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public MCNumber qtn_amt() {
		return qtn_amt_p().amt();
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(MCNumber value) {
		qtn_amt_p().amt(value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(int value) {
		qtn_amt_p().amt(value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(long value) {
		qtn_amt_p().amt(value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(float value) {
		qtn_amt_p().amt(value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(double value) {
		qtn_amt_p().amt(value);
	}

}

