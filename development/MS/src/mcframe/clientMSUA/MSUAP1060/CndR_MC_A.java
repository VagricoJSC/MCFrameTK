package mcframe.clientMSUA.MSUAP1060;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * Receiving point identification cd. (Input value) 送付先識別ＣＤ（入力値）.<p>
	 *
	 */
	public static final String $ship_to_id_cd_input = "ship_to_id_cd_input";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 * Receiving point identification alias name 1 送付先識別別名１.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm1 = "ship_to_id_alt_nm1";
	/**
	 * Receiving point identification alias name 2 送付先識別別名２.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm2 = "ship_to_id_alt_nm2";
	/**
	 * Receiving point identification alias name 3 送付先識別別名３.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm3 = "ship_to_id_alt_nm3";
	/**
	 * Receiving point identification alias name 4 送付先識別別名４.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm4 = "ship_to_id_alt_nm4";
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public static final String $match_typ = "match_typ";


	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_to_id_cd_input_META = createCommonMeta($ship_to_id_cd_input, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_id_alt_nm1_META = createCommonMeta($ship_to_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta ship_to_id_alt_nm2_META = createCommonMeta($ship_to_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta ship_to_id_alt_nm3_META = createCommonMeta($ship_to_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta ship_to_id_alt_nm4_META = createCommonMeta($ship_to_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta match_typ_META = createStringMeta($match_typ);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			base_dt_META,
			ship_to_id_cd_input_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_id_alt_nm1_META,
			ship_to_id_alt_nm2_META,
			ship_to_id_alt_nm3_META,
			ship_to_id_alt_nm4_META,
			match_typ_META
		},
		new String[][]{
			{
			},
			{
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 0, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 0, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 1, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 1, $ship_to_id_typ_nm, value);
	}


	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 2, $base_dt);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 2, $base_dt, value);
	}


	/**
	 * Receiving point identification cd. (Input value) 送付先識別ＣＤ（入力値）.<p>
	 *
	 */
	public String ship_to_id_cd_input() {
		return getConstString(offset + 3, $ship_to_id_cd_input);
	}

	/**
	 * Receiving point identification cd. (Input value) 送付先識別ＣＤ（入力値）.<p>
	 *
	 */
	public void ship_to_id_cd_input(String value) {
		setConstString(offset + 3, $ship_to_id_cd_input, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 4, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 4, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 5, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 5, $ship_to_id_nm, value);
	}


	/**
	 * Receiving point identification alias name 1 送付先識別別名１.<p>
	 *
	 */
	public String ship_to_id_alt_nm1() {
		return getConstString(offset + 6, $ship_to_id_alt_nm1);
	}

	/**
	 * Receiving point identification alias name 1 送付先識別別名１.<p>
	 *
	 */
	public void ship_to_id_alt_nm1(String value) {
		setConstString(offset + 6, $ship_to_id_alt_nm1, value);
	}


	/**
	 * Receiving point identification alias name 2 送付先識別別名２.<p>
	 *
	 */
	public String ship_to_id_alt_nm2() {
		return getConstString(offset + 7, $ship_to_id_alt_nm2);
	}

	/**
	 * Receiving point identification alias name 2 送付先識別別名２.<p>
	 *
	 */
	public void ship_to_id_alt_nm2(String value) {
		setConstString(offset + 7, $ship_to_id_alt_nm2, value);
	}


	/**
	 * Receiving point identification alias name 3 送付先識別別名３.<p>
	 *
	 */
	public String ship_to_id_alt_nm3() {
		return getConstString(offset + 8, $ship_to_id_alt_nm3);
	}

	/**
	 * Receiving point identification alias name 3 送付先識別別名３.<p>
	 *
	 */
	public void ship_to_id_alt_nm3(String value) {
		setConstString(offset + 8, $ship_to_id_alt_nm3, value);
	}


	/**
	 * Receiving point identification alias name 4 送付先識別別名４.<p>
	 *
	 */
	public String ship_to_id_alt_nm4() {
		return getConstString(offset + 9, $ship_to_id_alt_nm4);
	}

	/**
	 * Receiving point identification alias name 4 送付先識別別名４.<p>
	 *
	 */
	public void ship_to_id_alt_nm4(String value) {
		setConstString(offset + 9, $ship_to_id_alt_nm4, value);
	}


	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public String match_typ() {
		return getConstString(offset + 10, $match_typ);
	}

	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public void match_typ(String value) {
		setConstString(offset + 10, $match_typ, value);
	}


	public String getString(String name) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd_input.equalsIgnoreCase(name)) {
			return ship_to_id_cd_input();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd_input.equalsIgnoreCase(name)) {
			return ship_to_id_cd_input();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd_input.equalsIgnoreCase(name)) {
			ship_to_id_cd_input(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd_input.equalsIgnoreCase(name)) {
			ship_to_id_cd_input(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

