package mcframe.serverMSBE.MSBEL5040;

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
 * ブロック"Prio_List"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prio_ListR_MC_A extends MCConstRow {

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	/**
	 * Priority type 優先順タイプ.<p>
	 *
	 */
	public static final String $prio_typ = "prio_typ";
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public static final String $prio2 = "prio2";
	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public static final String $tmp_prio = "tmp_prio";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta prio_typ_META = createStringMeta($prio_typ);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta prio2_META = createCommonMeta($prio2, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta tmp_prio_META = createCommonMeta($tmp_prio, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);

	protected static final ConstMetaList<Prio_ListR> constMetas = new ConstMetaList<Prio_ListR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			stk_loc_cd_META,
			prio_typ_META,
			prio_META,
			prio2_META,
			tmp_prio_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Prio_ListR_MC_A(ConstMetaList<? extends Prio_ListR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prio_ListR clone() {
		return (Prio_ListR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prio_ListR createInstance() {
		return (Prio_ListR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prio_ListR getValues(String... names) {
		return (Prio_ListR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 4, $stk_loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 4, $stk_loc_cd, value);
	}


	/**
	 * Priority type 優先順タイプ.<p>
	 *
	 */
	public String prio_typ() {
		return getConstString(offset + 5, $prio_typ);
	}

	/**
	 * Priority type 優先順タイプ.<p>
	 *
	 */
	public void prio_typ(String value) {
		setConstString(offset + 5, $prio_typ, value);
	}


	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 6, $prio);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 6, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 6, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 6, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 6, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 6, $prio, value);
	}


	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public MCNumber prio2() {
		return getConstNumber(offset + 7, $prio2);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(MCNumber value) {
		setConstNumber(offset + 7, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(int value) {
		setConstNumber(offset + 7, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(long value) {
		setConstNumber(offset + 7, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(float value) {
		setConstNumber(offset + 7, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(double value) {
		setConstNumber(offset + 7, $prio2, value);
	}


	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public MCNumber tmp_prio() {
		return getConstNumber(offset + 8, $tmp_prio);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(MCNumber value) {
		setConstNumber(offset + 8, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(int value) {
		setConstNumber(offset + 8, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(long value) {
		setConstNumber(offset + 8, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(float value) {
		setConstNumber(offset + 8, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(double value) {
		setConstNumber(offset + 8, $tmp_prio, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($prio_typ.equalsIgnoreCase(name)) {
			return prio_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prio2.equalsIgnoreCase(name)) {
			return prio2();
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			return tmp_prio();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($prio_typ.equalsIgnoreCase(name)) {
			return prio_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prio2.equalsIgnoreCase(name)) {
			return prio2();
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			return tmp_prio();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($prio_typ.equalsIgnoreCase(name)) {
			prio_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($prio_typ.equalsIgnoreCase(name)) {
			prio_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

