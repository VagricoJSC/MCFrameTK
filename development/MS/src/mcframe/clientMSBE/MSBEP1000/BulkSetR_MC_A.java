package mcframe.clientMSBE.MSBEP1000;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	public static final String $gi_rqst_dt_p = "gi_rqst_dt_p";
	public static final String $gr_rqst_dt_p = "gr_rqst_dt_p";
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public static final String $rcpt_dt = "rcpt_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";

	public static final String $gi_rqst_dt = $gi_rqst_dt_p + ".ymd";
	public static final String $gi_rqst_hm = $gi_rqst_dt_p + ".hm";
	public static final String $gr_rqst_dt = $gr_rqst_dt_p + ".ymd";
	public static final String $gr_rqst_hm = $gr_rqst_dt_p + ".hm";
	public static final String $rqst_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $rqst_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $rqst_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $rqst_dpt_nm = $usr_dpt_p + ".dpt_nm";

	public static final MCMeta gi_rqst_dt_p_META = createInnerRowMeta($gi_rqst_dt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta gr_rqst_dt_p_META = createInnerRowMeta($gr_rqst_dt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			gi_rqst_dt_p_META,
			gr_rqst_dt_p_META,
			rcpt_dt_META,
			usr_dpt_p_META
		},
		new String[][]{
			{
				"gi_rqst_dt",
				"gi_rqst_hm",
				"gr_rqst_dt",
				"gr_rqst_hm",
				"rqst_usr_cd",
				"rqst_usr_nm",
				"rqst_dpt_cd",
				"rqst_dpt_nm"
			},
			{
				$gi_rqst_dt,
				$gi_rqst_hm,
				$gr_rqst_dt,
				$gr_rqst_hm,
				$rqst_usr_cd,
				$rqst_usr_nm,
				$rqst_dpt_cd,
				$rqst_dpt_nm
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0110.YmdHmR gi_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 0, $gi_rqst_dt_p);
	}
	
	public void gi_rqst_dt_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 0, $gi_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR gr_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 1, $gr_rqst_dt_p);
	}
	
	public void gr_rqst_dt_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 1, $gr_rqst_dt_p, row);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 2, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 2, $rcpt_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 3, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 3, $usr_dpt_p, row);
	}


	public MCDate getDate(String name) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($gi_rqst_dt_p.equalsIgnoreCase(name)) {
			return gi_rqst_dt_p();
		}
		if ($gr_rqst_dt_p.equalsIgnoreCase(name)) {
			return gr_rqst_dt_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($gi_rqst_dt_p.equalsIgnoreCase(name)) {
			gi_rqst_dt_p(
				((MCContainerMeta) gi_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($gr_rqst_dt_p.equalsIgnoreCase(name)) {
			gr_rqst_dt_p(
				((MCContainerMeta) gr_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
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


	/**
	 * Desired GI date 出庫希望日.<p>
	 *
	 */
	public MCDate gi_rqst_dt() {
		return gi_rqst_dt_p().ymd();
	}

	/**
	 * Desired GI date 出庫希望日.<p>
	 *
	 */
	public void gi_rqst_dt(MCDate value) {
		gi_rqst_dt_p().ymd(value);
	}

	/**
	 * Desired GI time 出庫希望時刻.<p>
	 *
	 */
	public MCDate gi_rqst_hm() {
		return gi_rqst_dt_p().hm();
	}

	/**
	 * Desired GI time 出庫希望時刻.<p>
	 *
	 */
	public void gi_rqst_hm(MCDate value) {
		gi_rqst_dt_p().hm(value);
	}

	/**
	 * Desired GR date 入庫希望日.<p>
	 *
	 */
	public MCDate gr_rqst_dt() {
		return gr_rqst_dt_p().ymd();
	}

	/**
	 * Desired GR date 入庫希望日.<p>
	 *
	 */
	public void gr_rqst_dt(MCDate value) {
		gr_rqst_dt_p().ymd(value);
	}

	/**
	 * Desired GR time 入庫希望時刻.<p>
	 *
	 */
	public MCDate gr_rqst_hm() {
		return gr_rqst_dt_p().hm();
	}

	/**
	 * Desired GR time 入庫希望時刻.<p>
	 *
	 */
	public void gr_rqst_hm(MCDate value) {
		gr_rqst_dt_p().hm(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

}

