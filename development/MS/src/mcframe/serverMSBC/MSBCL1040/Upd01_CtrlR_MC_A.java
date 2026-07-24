package mcframe.serverMSBC.MSBCL1040;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Upd01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Allocation type 引当種別.<p>
	 *
	 */
	public static final String $alloc_ope_flg = "alloc_ope_flg";
	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public static final String $oper_unit_flg = "oper_unit_flg";
	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public static final String $re_alloc_mode_flg = "re_alloc_mode_flg";
	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $inst_immed_prnt_flg = "inst_immed_prnt_flg";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";


	public static final MCMeta alloc_ope_flg_META = createCommonMeta($alloc_ope_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_unit_flg_META = createCommonMeta($oper_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_alloc_mode_flg_META = createCommonMeta($re_alloc_mode_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_immed_prnt_flg_META = createCommonMeta($inst_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);

	protected static final ConstMetaList<Upd01_CtrlR> constMetas = new ConstMetaList<Upd01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			alloc_ope_flg_META,
			oper_unit_flg_META,
			re_alloc_mode_flg_META,
			inst_immed_prnt_flg_META,
			mfg_sts_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Upd01_CtrlR_MC_A(ConstMetaList<? extends Upd01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR clone() {
		return (Upd01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR createInstance() {
		return (Upd01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR getValues(String... names) {
		return (Upd01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Allocation type 引当種別.<p>
	 *
	 */
	public boolean alloc_ope_flg() {
		return getConstBoolean(offset + 0, $alloc_ope_flg);
	}

	/**
	 * Allocation type 引当種別.<p>
	 *
	 */
	public void alloc_ope_flg(boolean value) {
		setConstBoolean(offset + 0, $alloc_ope_flg, value);
	}


	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public boolean oper_unit_flg() {
		return getConstBoolean(offset + 1, $oper_unit_flg);
	}

	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public void oper_unit_flg(boolean value) {
		setConstBoolean(offset + 1, $oper_unit_flg, value);
	}


	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public boolean re_alloc_mode_flg() {
		return getConstBoolean(offset + 2, $re_alloc_mode_flg);
	}

	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public void re_alloc_mode_flg(boolean value) {
		setConstBoolean(offset + 2, $re_alloc_mode_flg, value);
	}


	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean inst_immed_prnt_flg() {
		return getConstBoolean(offset + 3, $inst_immed_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void inst_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $inst_immed_prnt_flg, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 4, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 4, $mfg_sts_typ, value);
	}


	public String getString(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			return alloc_ope_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			return alloc_ope_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			alloc_ope_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			alloc_ope_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

