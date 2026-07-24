package mcframe.clientMSBF.MSBFP0030;

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
 * ブロック"InspBulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspBulkSetR_MC_A extends MCConstRow {

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	public static final String $inst_usr_dpt_p = "inst_usr_dpt_p";

	public static final String $inst_usr_cd = $inst_usr_dpt_p + ".usr_cd";
	public static final String $inst_usr_nm = $inst_usr_dpt_p + ".usr_nm";
	public static final String $inst_dpt_cd = $inst_usr_dpt_p + ".dpt_cd";
	public static final String $inst_dpt_nm = $inst_usr_dpt_p + ".dpt_nm";

	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_dpt_p_META = createInnerRowMeta($inst_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);

	protected static final ConstMetaList<InspBulkSetR> constMetas = new ConstMetaList<InspBulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inst_dt_META,
			inst_usr_dpt_p_META
		},
		new String[][]{
			{
				"inst_usr_cd",
				"inst_usr_nm",
				"inst_dpt_cd",
				"inst_dpt_nm"
			},
			{
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
				{$inst_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// inst_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "inst_dt;inst_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// inst_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// inst_usr_dpt_p.dpt_cd
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
	protected InspBulkSetR_MC_A(ConstMetaList<? extends InspBulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspBulkSetR clone() {
		return (InspBulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspBulkSetR createInstance() {
		return (InspBulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspBulkSetR getValues(String... names) {
		return (InspBulkSetR) super.getValues(names);
	}



	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 0, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 0, $inst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR inst_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 1, $inst_usr_dpt_p);
	}
	
	public void inst_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 1, $inst_usr_dpt_p, row);
	}


	public MCDate getDate(String name) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			return inst_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			inst_usr_dpt_p(
				((MCContainerMeta) inst_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Order PIC 指図担当者.<p>
	 *
	 */
	public String inst_usr_cd() {
		return inst_usr_dpt_p().usr_cd();
	}

	/**
	 * Order PIC 指図担当者.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		inst_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return inst_usr_dpt_p().usr_nm();
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		inst_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Order dept. 指図部門.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return inst_usr_dpt_p().dpt_cd();
	}

	/**
	 * Order dept. 指図部門.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		inst_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return inst_usr_dpt_p().dpt_nm();
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		inst_usr_dpt_p().dpt_nm(value);
	}

}

