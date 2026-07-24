package mcframe.serverMSBE.MSBEL6610;

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
 * ブロック"StktkList_Prnt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StktkList_Prnt01_DtlR_MC_A extends MCConstRow {

	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public static final String $ctrl_tgt_dt = "ctrl_tgt_dt";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
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
	 * Inventory count sheet flg. 棚卸表ＦＬＧ.<p>
	 *
	 */
	public static final String $stktk_rpt_flg = "stktk_rpt_flg";
	/**
	 * Inventory variance list flg. 実棚差異リストＦＬＧ.<p>
	 *
	 */
	public static final String $diff_rpt_flg = "diff_rpt_flg";
	/**
	 * Inventory count classification type 棚卸種別区分.<p>
	 *
	 */
	public static final String $stktk_typ = "stktk_typ";
	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public static final String $stktk_rpt_rmrks = "stktk_rpt_rmrks";


	public static final MCMeta ctrl_tgt_dt_META = createCommonMeta($ctrl_tgt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta stktk_rpt_flg_META = createCommonMeta($stktk_rpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta diff_rpt_flg_META = createCommonMeta($diff_rpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_typ_META = createCommonMeta($stktk_typ, mcframe.commonMS.meta.MS_META.STKTK_TYP);
	public static final MCMeta stktk_rpt_rmrks_META = createCommonMeta($stktk_rpt_rmrks, mcframe.commonMS.meta.MS_META.STKTK_RPT_RMRKS);

	protected static final ConstMetaList<StktkList_Prnt01_DtlR> constMetas = new ConstMetaList<StktkList_Prnt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ctrl_tgt_dt_META,
			loc_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			stktk_rpt_flg_META,
			diff_rpt_flg_META,
			stktk_typ_META,
			stktk_rpt_rmrks_META
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
	protected StktkList_Prnt01_DtlR_MC_A(ConstMetaList<? extends StktkList_Prnt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StktkList_Prnt01_DtlR clone() {
		return (StktkList_Prnt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StktkList_Prnt01_DtlR createInstance() {
		return (StktkList_Prnt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StktkList_Prnt01_DtlR getValues(String... names) {
		return (StktkList_Prnt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public MCDate ctrl_tgt_dt() {
		return getConstDate(offset + 0, $ctrl_tgt_dt);
	}

	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public void ctrl_tgt_dt(MCDate value) {
		setConstDate(offset + 0, $ctrl_tgt_dt, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Inventory count sheet flg. 棚卸表ＦＬＧ.<p>
	 *
	 */
	public boolean stktk_rpt_flg() {
		return getConstBoolean(offset + 6, $stktk_rpt_flg);
	}

	/**
	 * Inventory count sheet flg. 棚卸表ＦＬＧ.<p>
	 *
	 */
	public void stktk_rpt_flg(boolean value) {
		setConstBoolean(offset + 6, $stktk_rpt_flg, value);
	}


	/**
	 * Inventory variance list flg. 実棚差異リストＦＬＧ.<p>
	 *
	 */
	public boolean diff_rpt_flg() {
		return getConstBoolean(offset + 7, $diff_rpt_flg);
	}

	/**
	 * Inventory variance list flg. 実棚差異リストＦＬＧ.<p>
	 *
	 */
	public void diff_rpt_flg(boolean value) {
		setConstBoolean(offset + 7, $diff_rpt_flg, value);
	}


	/**
	 * Inventory count classification type 棚卸種別区分.<p>
	 *
	 */
	public String stktk_typ() {
		return getConstString(offset + 8, $stktk_typ);
	}

	/**
	 * Inventory count classification type 棚卸種別区分.<p>
	 *
	 */
	public void stktk_typ(String value) {
		setConstString(offset + 8, $stktk_typ, value);
	}


	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public String stktk_rpt_rmrks() {
		return getConstString(offset + 9, $stktk_rpt_rmrks);
	}

	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public void stktk_rpt_rmrks(String value) {
		setConstString(offset + 9, $stktk_rpt_rmrks, value);
	}


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			return stktk_typ();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($stktk_rpt_flg.equalsIgnoreCase(name)) {
			return stktk_rpt_flg();
		}
		if ($diff_rpt_flg.equalsIgnoreCase(name)) {
			return diff_rpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			return stktk_typ();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($stktk_rpt_flg.equalsIgnoreCase(name)) {
			return stktk_rpt_flg();
		}
		if ($diff_rpt_flg.equalsIgnoreCase(name)) {
			return diff_rpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			stktk_typ(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			ctrl_tgt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($stktk_rpt_flg.equalsIgnoreCase(name)) {
			stktk_rpt_flg(value);
			return;
		}
		if ($diff_rpt_flg.equalsIgnoreCase(name)) {
			diff_rpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			stktk_typ(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			ctrl_tgt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($stktk_rpt_flg.equalsIgnoreCase(name)) {
			stktk_rpt_flg(value);
			return;
		}
		if ($diff_rpt_flg.equalsIgnoreCase(name)) {
			diff_rpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

