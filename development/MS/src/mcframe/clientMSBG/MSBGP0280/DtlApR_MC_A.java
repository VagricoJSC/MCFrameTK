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
 * ブロック"DtlAp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlApR_MC_A extends MCConstRow {

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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	public static final String $init_bal_p = "init_bal_p";
	public static final String $purc_amt_p = "purc_amt_p";
	public static final String $cash_amt_p = "cash_amt_p";
	public static final String $note_amt_p = "note_amt_p";
	public static final String $xfr_amt_p = "xfr_amt_p";
	public static final String $setoff_amt_p = "setoff_amt_p";
	public static final String $sw_amt_p = "sw_amt_p";
	public static final String $end_bal_p = "end_bal_p";
	public static final String $backord_amt_p = "backord_amt_p";
	public static final String $cred_amt_p = "cred_amt_p";

	public static final String $init_bal = $init_bal_p + ".amt";
	public static final String $purc_amt = $purc_amt_p + ".amt";
	public static final String $cash_amt = $cash_amt_p + ".amt";
	public static final String $note_amt = $note_amt_p + ".amt";
	public static final String $xfr_amt = $xfr_amt_p + ".amt";
	public static final String $setoff_amt = $setoff_amt_p + ".amt";
	public static final String $sw_amt = $sw_amt_p + ".amt";
	public static final String $end_bal = $end_bal_p + ".amt";
	public static final String $backord_amt = $backord_amt_p + ".amt";
	public static final String $cred_amt = $cred_amt_p + ".amt";

	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta init_bal_p_META = createInnerRowMeta($init_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_amt_p_META = createInnerRowMeta($purc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cash_amt_p_META = createInnerRowMeta($cash_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta note_amt_p_META = createInnerRowMeta($note_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_amt_p_META = createInnerRowMeta($xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_amt_p_META = createInnerRowMeta($setoff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_amt_p_META = createInnerRowMeta($sw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta end_bal_p_META = createInnerRowMeta($end_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta backord_amt_p_META = createInnerRowMeta($backord_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cred_amt_p_META = createInnerRowMeta($cred_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);

	protected static final ConstMetaList<DtlApR> constMetas = new ConstMetaList<DtlApR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			init_bal_p_META,
			purc_amt_p_META,
			cash_amt_p_META,
			note_amt_p_META,
			xfr_amt_p_META,
			setoff_amt_p_META,
			sw_amt_p_META,
			end_bal_p_META,
			backord_amt_p_META,
			cred_amt_p_META
		},
		new String[][]{
			{
				"init_bal",
				"purc_amt",
				"cash_amt",
				"note_amt",
				"xfr_amt",
				"setoff_amt",
				"sw_amt",
				"end_bal",
				"backord_amt",
				"cred_amt"
			},
			{
				$init_bal,
				$purc_amt,
				$cash_amt,
				$note_amt,
				$xfr_amt,
				$setoff_amt,
				$sw_amt,
				$end_bal,
				$backord_amt,
				$cred_amt
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
	protected DtlApR_MC_A(ConstMetaList<? extends DtlApR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlApR clone() {
		return (DtlApR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlApR createInstance() {
		return (DtlApR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlApR getValues(String... names) {
		return (DtlApR) super.getValues(names);
	}



	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 0, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 0, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 1, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 1, $ap_dpt_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 2, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 2, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 3, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 3, $asppl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR init_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 4, $init_bal_p);
	}
	
	public void init_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 4, $init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 5, $purc_amt_p);
	}
	
	public void purc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 5, $purc_amt_p, row);
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


	public mcframe.clientMAUB.MAUBP5050.AmtR backord_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 12, $backord_amt_p);
	}
	
	public void backord_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 12, $backord_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR cred_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 13, $cred_amt_p);
	}
	
	public void cred_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 13, $cred_amt_p, row);
	}


	public String getString(String name) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($init_bal_p.equalsIgnoreCase(name)) {
			return init_bal_p();
		}
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			return purc_amt_p();
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
		if ($backord_amt_p.equalsIgnoreCase(name)) {
			return backord_amt_p();
		}
		if ($cred_amt_p.equalsIgnoreCase(name)) {
			return cred_amt_p();
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
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			purc_amt_p(
				((MCContainerMeta) purc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
	 * Tax included purchase amount 税込仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return purc_amt_p().amt();
	}

	/**
	 * Tax included purchase amount 税込仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount 税込仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount 税込仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount 税込仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount 税込仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		purc_amt_p().amt(value);
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
	public MCNumber xfr_amt() {
		return xfr_amt_p().amt();
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void xfr_amt(int value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void xfr_amt(long value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void xfr_amt(float value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount 預金支払額.<p>
	 *
	 */
	public void xfr_amt(double value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Offset payment amount 相殺支払額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoff_amt_p().amt();
	}

	/**
	 * Offset payment amount 相殺支払額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset payment amount 相殺支払額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset payment amount 相殺支払額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset payment amount 相殺支払額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset payment amount 相殺支払額.<p>
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
	 * AP amount 買掛金.<p>
	 *
	 */
	public MCNumber end_bal() {
		return end_bal_p().amt();
	}

	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		end_bal_p().amt(value);
	}

	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public void end_bal(int value) {
		end_bal_p().amt(value);
	}

	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public void end_bal(long value) {
		end_bal_p().amt(value);
	}

	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public void end_bal(float value) {
		end_bal_p().amt(value);
	}

	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public void end_bal(double value) {
		end_bal_p().amt(value);
	}

	/**
	 * Remaining PO 発注残.<p>
	 *
	 */
	public MCNumber backord_amt() {
		return backord_amt_p().amt();
	}

	/**
	 * Remaining PO 発注残.<p>
	 *
	 */
	public void backord_amt(MCNumber value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Remaining PO 発注残.<p>
	 *
	 */
	public void backord_amt(int value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Remaining PO 発注残.<p>
	 *
	 */
	public void backord_amt(long value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Remaining PO 発注残.<p>
	 *
	 */
	public void backord_amt(float value) {
		backord_amt_p().amt(value);
	}

	/**
	 * Remaining PO 発注残.<p>
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

}

