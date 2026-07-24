package mcframe.clientMSBD.MSBDP0090;

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
	 * PO date 発注日.<p>
	 *
	 */
	public static final String $po_dt = "po_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Select same header 同一ヘッダ選択.<p>
	 *
	 */
	public static final String $collect_flg = "collect_flg";
	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public static final String $async_flg = "async_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";

	public static final String $purc_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $purc_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $purc_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $purc_dpt_nm = $usr_dpt_p + ".dpt_nm";

	public static final MCMeta po_dt_META = createCommonMeta($po_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta collect_flg_META = createCommonMeta($collect_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta async_flg_META = createCommonMeta($async_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_dt_META,
			usr_dpt_p_META,
			collect_flg_META,
			async_flg_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			ap_dpt_flg_META
		},
		new String[][]{
			{
				"purc_usr_cd",
				"purc_usr_nm",
				"purc_dpt_cd",
				"purc_dpt_nm"
			},
			{
				$purc_usr_cd,
				$purc_usr_nm,
				$purc_dpt_cd,
				$purc_dpt_nm
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
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;wg_nm;ap_dpt_flg"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".usr_cd", "po_dt"},	// usr_dpt_p.usr_cd
				{$usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.PURC;po_dt;purc_usr_cd;true"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".usr_cd", "dt"},	// usr_dpt_p.usr_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd;wr_flg"}	// usr_dpt_p.dpt_cd
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
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 0, $po_dt);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 0, $po_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 1, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 1, $usr_dpt_p, row);
	}


	/**
	 * Select same header 同一ヘッダ選択.<p>
	 *
	 */
	public boolean collect_flg() {
		return getConstBoolean(offset + 2, $collect_flg);
	}

	/**
	 * Select same header 同一ヘッダ選択.<p>
	 *
	 */
	public void collect_flg(boolean value) {
		setConstBoolean(offset + 2, $collect_flg, value);
	}


	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public boolean async_flg() {
		return getConstBoolean(offset + 3, $async_flg);
	}

	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public void async_flg(boolean value) {
		setConstBoolean(offset + 3, $async_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 4, $purc_dpt_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 4, $purc_dpt_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 5, $purc_dpt_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 5, $purc_dpt_wg_nm, value);
	}


	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 6, $ap_dpt_flg);
	}

	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 6, $ap_dpt_flg, value);
	}


	public String getString(String name) {
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($collect_flg.equalsIgnoreCase(name)) {
			return collect_flg();
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			return async_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($collect_flg.equalsIgnoreCase(name)) {
			return collect_flg();
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			return async_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($collect_flg.equalsIgnoreCase(name)) {
			collect_flg(value);
			return;
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			async_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($collect_flg.equalsIgnoreCase(name)) {
			collect_flg(value);
			return;
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			async_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
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
		super.setInnerRow(name, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

}

