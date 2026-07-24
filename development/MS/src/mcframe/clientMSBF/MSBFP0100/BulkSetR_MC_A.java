package mcframe.clientMSBF.MSBFP0100;

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

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	public static final String $judg_rsn_p = "judg_rsn_p";
	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Column clear 項目クリア.<p>
	 *
	 */
	public static final String $all_clear_flg = "all_clear_flg";

	public static final String $judg_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $judg_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $judg_usr_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $judg_usr_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $judg_rsn = $judg_rsn_p + ".txt";

	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta judg_rsn_p_META = createInnerRowMeta($judg_rsn_p, mcframe.clientMAUB.MAUBP0220.TxtR.class);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MRKT_JUDG_INTR_RMRKS);
	public static final MCMeta all_clear_flg_META = createCommonMeta($all_clear_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			judg_dt_META,
			usr_dpt_p_META,
			judg_rsn_p_META,
			intr_rmrks_META,
			all_clear_flg_META
		},
		new String[][]{
			{
				"judg_usr_cd",
				"judg_usr_nm",
				"judg_usr_dpt_cd",
				"judg_usr_dpt_nm",
				"judg_rsn"
			},
			{
				$judg_usr_cd,
				$judg_usr_nm,
				$judg_usr_dpt_cd,
				$judg_usr_dpt_nm,
				$judg_rsn
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
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "judg_dt;judg_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
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



	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 0, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 0, $judg_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 1, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 1, $usr_dpt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0220.TxtR judg_rsn_p(){
		return (mcframe.clientMAUB.MAUBP0220.TxtR) getConstInnerRow(offset + 2, $judg_rsn_p);
	}
	
	public void judg_rsn_p(mcframe.clientMAUB.MAUBP0220.TxtR row){
		setConstInnerRow(offset + 2, $judg_rsn_p, row);
	}


	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 3, $intr_rmrks);
	}

	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 3, $intr_rmrks, value);
	}


	/**
	 * Column clear 項目クリア.<p>
	 *
	 */
	public boolean all_clear_flg() {
		return getConstBoolean(offset + 4, $all_clear_flg);
	}

	/**
	 * Column clear 項目クリア.<p>
	 *
	 */
	public void all_clear_flg(boolean value) {
		setConstBoolean(offset + 4, $all_clear_flg, value);
	}


	public String getString(String name) {
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($all_clear_flg.equalsIgnoreCase(name)) {
			return all_clear_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($all_clear_flg.equalsIgnoreCase(name)) {
			return all_clear_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($all_clear_flg.equalsIgnoreCase(name)) {
			all_clear_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($all_clear_flg.equalsIgnoreCase(name)) {
			all_clear_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($judg_rsn_p.equalsIgnoreCase(name)) {
			return judg_rsn_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		if ($judg_rsn_p.equalsIgnoreCase(name)) {
			judg_rsn_p(
				((MCContainerMeta) judg_rsn_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0220.TxtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public String judg_usr_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public void judg_usr_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public String judg_usr_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public void judg_usr_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return judg_rsn_p().txt();
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		judg_rsn_p().txt(value);
	}

}

