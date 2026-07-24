package mcframe.clientMSBE.MSBEP2000;

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

	public static final String $arr_dt_p = "arr_dt_p";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $arr_usr_dpt_p = "arr_usr_dpt_p";

	public static final String $arr_dt = $arr_dt_p + ".ymd";
	public static final String $arr_hm = $arr_dt_p + ".hm";
	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $arr_usr_cd = $arr_usr_dpt_p + ".usr_cd";
	public static final String $arr_usr_nm = $arr_usr_dpt_p + ".usr_nm";
	public static final String $arr_dpt_cd = $arr_usr_dpt_p + ".dpt_cd";
	public static final String $arr_dpt_nm = $arr_usr_dpt_p + ".dpt_nm";

	public static final MCMeta arr_dt_p_META = createInnerRowMeta($arr_dt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP0310.AcDtR.class);
	public static final MCMeta arr_usr_dpt_p_META = createInnerRowMeta($arr_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			arr_dt_p_META,
			ac_dt_p_META,
			arr_usr_dpt_p_META
		},
		new String[][]{
			{
				"arr_dt",
				"arr_hm",
				"ac_dt",
				"arr_usr_cd",
				"arr_usr_nm",
				"arr_dpt_cd",
				"arr_dpt_nm"
			},
			{
				$arr_dt,
				$arr_hm,
				$ac_dt,
				$arr_usr_cd,
				$arr_usr_nm,
				$arr_dpt_cd,
				$arr_dpt_nm
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
	/** 項目属性情報のグループ[PROV_ONLY_ITEM]のキー定数 */
	public static final String $$PROV_ONLY_ITEM = "PROV_ONLY_ITEM";
	/** 項目属性情報のグループ[ARR_ONLY_ITEM]のキー定数 */
	public static final String $$ARR_ONLY_ITEM = "ARR_ONLY_ITEM";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$arr_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// arr_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$arr_usr_dpt_p + ".dpt_cd", "arr_dt;arr_usr_cd;MAC_DPT_IS_SRCH_TYP.ARR"}	// arr_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$arr_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// arr_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$PROV_ONLY_ITEM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ARR_ONLY_ITEM, new MCExtList(
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



	public mcframe.clientMAUB.MAUBP0110.YmdHmR arr_dt_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 0, $arr_dt_p);
	}
	
	public void arr_dt_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 0, $arr_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0310.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0310.AcDtR) getConstInnerRow(offset + 1, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP0310.AcDtR row){
		setConstInnerRow(offset + 1, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR arr_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 2, $arr_usr_dpt_p);
	}
	
	public void arr_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 2, $arr_usr_dpt_p, row);
	}






	public MCRow getInnerRow(String name) {
		if ($arr_dt_p.equalsIgnoreCase(name)) {
			return arr_dt_p();
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($arr_usr_dpt_p.equalsIgnoreCase(name)) {
			return arr_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arr_dt_p.equalsIgnoreCase(name)) {
			arr_dt_p(
				((MCContainerMeta) arr_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0310.AcDtR.class, value)
			);
			return;
		}
		if ($arr_usr_dpt_p.equalsIgnoreCase(name)) {
			arr_usr_dpt_p(
				((MCContainerMeta) arr_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public MCDate arr_dt() {
		return arr_dt_p().ymd();
	}

	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public void arr_dt(MCDate value) {
		arr_dt_p().ymd(value);
	}

	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public MCDate arr_hm() {
		return arr_dt_p().hm();
	}

	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public void arr_hm(MCDate value) {
		arr_dt_p().hm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return arr_usr_dpt_p().usr_cd();
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		arr_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public String arr_usr_nm() {
		return arr_usr_dpt_p().usr_nm();
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public void arr_usr_nm(String value) {
		arr_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return arr_usr_dpt_p().dpt_cd();
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		arr_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public String arr_dpt_nm() {
		return arr_usr_dpt_p().dpt_nm();
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public void arr_dpt_nm(String value) {
		arr_usr_dpt_p().dpt_nm(value);
	}

}

