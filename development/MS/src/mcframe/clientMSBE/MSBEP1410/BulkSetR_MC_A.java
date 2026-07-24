package mcframe.clientMSBE.MSBEP1410;

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

	public static final String $ship_inst_tm_p = "ship_inst_tm_p";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public static final String $indiv_inst_prnt_flg = "indiv_inst_prnt_flg";
	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";

	public static final String $ship_inst_dt = $ship_inst_tm_p + ".ymd";
	public static final String $ship_inst_hm = $ship_inst_tm_p + ".hm";
	public static final String $inst_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $inst_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $inst_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $inst_dpt_nm = $usr_dpt_p + ".dpt_nm";

	public static final MCMeta ship_inst_tm_p_META = createInnerRowMeta($ship_inst_tm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta indiv_inst_prnt_flg_META = createCommonMeta($indiv_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ship_inst_tm_p_META,
			usr_dpt_p_META,
			indiv_inst_prnt_flg_META,
			indiv_prnt_flg_META
		},
		new String[][]{
			{
				"ship_inst_dt",
				"ship_inst_hm",
				"inst_usr_cd",
				"inst_usr_nm",
				"inst_dpt_cd",
				"inst_dpt_nm"
			},
			{
				$ship_inst_dt,
				$ship_inst_hm,
				$inst_usr_cd,
				$inst_usr_nm,
				$inst_dpt_cd,
				$inst_dpt_nm
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
				{$usr_dpt_p + ".dpt_cd", "ship_inst_dt;inst_usr_cd;MAC_DPT_IS_SRCH_TYP.SHIP"}	// usr_dpt_p.dpt_cd
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



	public mcframe.clientMAUB.MAUBP0110.YmdHmR ship_inst_tm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 0, $ship_inst_tm_p);
	}
	
	public void ship_inst_tm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 0, $ship_inst_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 1, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 1, $usr_dpt_p, row);
	}


	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public boolean indiv_inst_prnt_flg() {
		return getConstBoolean(offset + 2, $indiv_inst_prnt_flg);
	}

	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public void indiv_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $indiv_inst_prnt_flg, value);
	}


	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 3, $indiv_prnt_flg);
	}

	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $indiv_prnt_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_inst_prnt_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_inst_prnt_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			indiv_inst_prnt_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			indiv_inst_prnt_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_inst_tm_p.equalsIgnoreCase(name)) {
			return ship_inst_tm_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_inst_tm_p.equalsIgnoreCase(name)) {
			ship_inst_tm_p(
				((MCContainerMeta) ship_inst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
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
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public MCDate ship_inst_dt() {
		return ship_inst_tm_p().ymd();
	}

	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public void ship_inst_dt(MCDate value) {
		ship_inst_tm_p().ymd(value);
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public MCDate ship_inst_hm() {
		return ship_inst_tm_p().hm();
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public void ship_inst_hm(MCDate value) {
		ship_inst_tm_p().hm(value);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

}

