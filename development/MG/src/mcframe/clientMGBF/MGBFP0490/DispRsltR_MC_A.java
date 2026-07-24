package mcframe.clientMGBF.MGBFP0490;

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
 * ブロック"DispRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispRsltR_MC_A extends MCConstRow {

	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $item = "item";
	public static final String $itm_p = "itm_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Column ID 項目ＩＤ.<p>
	 *
	 */
	public static final String $id = "id";
	public static final String $col_000 = "col_000";
	public static final String $col_001 = "col_001";
	public static final String $col_002 = "col_002";
	public static final String $col_003 = "col_003";
	public static final String $col_004 = "col_004";
	public static final String $col_005 = "col_005";
	public static final String $col_006 = "col_006";
	public static final String $col_007 = "col_007";
	public static final String $col_008 = "col_008";
	public static final String $col_009 = "col_009";
	public static final String $col_010 = "col_010";
	public static final String $col_011 = "col_011";
	public static final String $col_012 = "col_012";
	public static final String $col_013 = "col_013";
	public static final String $col_014 = "col_014";
	public static final String $col_015 = "col_015";
	public static final String $col_016 = "col_016";
	public static final String $col_017 = "col_017";
	public static final String $col_018 = "col_018";
	public static final String $col_019 = "col_019";
	public static final String $col_020 = "col_020";
	public static final String $col_021 = "col_021";
	public static final String $col_022 = "col_022";
	public static final String $col_023 = "col_023";
	public static final String $col_024 = "col_024";
	public static final String $col_025 = "col_025";
	public static final String $col_026 = "col_026";
	public static final String $col_027 = "col_027";
	public static final String $col_028 = "col_028";
	public static final String $col_029 = "col_029";
	public static final String $col_030 = "col_030";
	public static final String $col_031 = "col_031";
	public static final String $col_032 = "col_032";
	public static final String $col_033 = "col_033";
	public static final String $col_034 = "col_034";
	public static final String $col_035 = "col_035";
	public static final String $col_036 = "col_036";
	public static final String $col_037 = "col_037";
	public static final String $col_038 = "col_038";
	public static final String $col_039 = "col_039";
	public static final String $col_040 = "col_040";
	public static final String $col_041 = "col_041";
	public static final String $col_042 = "col_042";
	public static final String $col_043 = "col_043";
	public static final String $col_044 = "col_044";
	public static final String $col_045 = "col_045";
	public static final String $col_046 = "col_046";
	public static final String $col_047 = "col_047";
	public static final String $col_048 = "col_048";
	public static final String $col_049 = "col_049";
	public static final String $col_050 = "col_050";
	public static final String $col_051 = "col_051";
	public static final String $col_052 = "col_052";
	public static final String $col_053 = "col_053";
	public static final String $col_054 = "col_054";
	public static final String $col_055 = "col_055";
	public static final String $col_056 = "col_056";
	public static final String $col_057 = "col_057";
	public static final String $col_058 = "col_058";
	public static final String $col_059 = "col_059";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln = "pln";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $diff = "diff";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta item_META = createStringMeta($item);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta id_META = createNumberMeta($id);
	public static final MCMeta col_000_META = createCommonMeta($col_000, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_005_META = createCommonMeta($col_005, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_007_META = createCommonMeta($col_007, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_010_META = createCommonMeta($col_010, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_014_META = createCommonMeta($col_014, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_015_META = createCommonMeta($col_015, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_020_META = createCommonMeta($col_020, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_021_META = createCommonMeta($col_021, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_025_META = createCommonMeta($col_025, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_028_META = createCommonMeta($col_028, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_030_META = createCommonMeta($col_030, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_035_META = createCommonMeta($col_035, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_040_META = createCommonMeta($col_040, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_042_META = createCommonMeta($col_042, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_045_META = createCommonMeta($col_045, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_049_META = createCommonMeta($col_049, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_050_META = createCommonMeta($col_050, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_055_META = createCommonMeta($col_055, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_056_META = createCommonMeta($col_056, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_META = createCommonMeta($pln, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_META = createCommonMeta($diff, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			item_META,
			itm_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			id_META,
			col_000_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			col_005_META,
			col_006_META,
			col_007_META,
			col_008_META,
			col_009_META,
			col_010_META,
			col_011_META,
			col_012_META,
			col_013_META,
			col_014_META,
			col_015_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			col_020_META,
			col_021_META,
			col_022_META,
			col_023_META,
			col_024_META,
			col_025_META,
			col_026_META,
			col_027_META,
			col_028_META,
			col_029_META,
			col_030_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			col_035_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			col_040_META,
			col_041_META,
			col_042_META,
			col_043_META,
			col_044_META,
			col_045_META,
			col_046_META,
			col_047_META,
			col_048_META,
			col_049_META,
			col_050_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			col_055_META,
			col_056_META,
			col_057_META,
			col_058_META,
			col_059_META,
			ttl_META,
			pln_META,
			diff_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
				{$unit_cd, "Key"},	// unit_cd
				{$unit_nm, "Key"}	// unit_nm
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$pln, "pln_flg"},	// pln
				{$diff, "pln_flg"}	// diff
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$col_000, "Key"},	// col_000
				{$col_001, "Key"},	// col_001
				{$col_002, "Key"},	// col_002
				{$col_003, "Key"},	// col_003
				{$col_004, "Key"},	// col_004
				{$col_005, "Key"},	// col_005
				{$col_006, "Key"},	// col_006
				{$col_007, "Key"},	// col_007
				{$col_008, "Key"},	// col_008
				{$col_009, "Key"},	// col_009
				{$col_010, "Key"},	// col_010
				{$col_011, "Key"},	// col_011
				{$col_012, "Key"},	// col_012
				{$col_013, "Key"},	// col_013
				{$col_014, "Key"},	// col_014
				{$col_015, "Key"},	// col_015
				{$col_016, "Key"},	// col_016
				{$col_017, "Key"},	// col_017
				{$col_018, "Key"},	// col_018
				{$col_019, "Key"},	// col_019
				{$col_020, "Key"},	// col_020
				{$col_021, "Key"},	// col_021
				{$col_022, "Key"},	// col_022
				{$col_023, "Key"},	// col_023
				{$col_024, "Key"},	// col_024
				{$col_025, "Key"},	// col_025
				{$col_026, "Key"},	// col_026
				{$col_027, "Key"},	// col_027
				{$col_028, "Key"},	// col_028
				{$col_029, "Key"},	// col_029
				{$col_030, "Key"},	// col_030
				{$col_031, "Key"},	// col_031
				{$col_032, "Key"},	// col_032
				{$col_033, "Key"},	// col_033
				{$col_034, "Key"},	// col_034
				{$col_035, "Key"},	// col_035
				{$col_036, "Key"},	// col_036
				{$col_037, "Key"},	// col_037
				{$col_038, "Key"},	// col_038
				{$col_039, "Key"},	// col_039
				{$col_040, "Key"},	// col_040
				{$col_041, "Key"},	// col_041
				{$col_042, "Key"},	// col_042
				{$col_043, "Key"},	// col_043
				{$col_044, "Key"},	// col_044
				{$col_045, "Key"},	// col_045
				{$col_046, "Key"},	// col_046
				{$col_047, "Key"},	// col_047
				{$col_048, "Key"},	// col_048
				{$col_049, "Key"},	// col_049
				{$col_050, "Key"},	// col_050
				{$col_051, "Key"},	// col_051
				{$col_052, "Key"},	// col_052
				{$col_053, "Key"},	// col_053
				{$col_054, "Key"},	// col_054
				{$col_055, "Key"},	// col_055
				{$col_056, "Key"},	// col_056
				{$col_057, "Key"},	// col_057
				{$col_058, "Key"},	// col_058
				{$col_059, "Key"}	// col_059
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	protected DispRsltR_MC_A(ConstMetaList<? extends DispRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR clone() {
		return (DispRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR createInstance() {
		return (DispRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR getValues(String... names) {
		return (DispRsltR) super.getValues(names);
	}



	/**
	 * Column 項目.<p>
	 *
	 */
	public String item() {
		return getConstString(offset + 0, $item);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void item(String value) {
		setConstString(offset + 0, $item, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $itm_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 2, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 2, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 3, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 3, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 4, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 4, $dec_place, value);
	}


	/**
	 * Column ID 項目ＩＤ.<p>
	 *
	 */
	public MCNumber id() {
		return getConstNumber(offset + 5, $id);
	}

	/**
	 * Column ID 項目ＩＤ.<p>
	 *
	 */
	public void id(MCNumber value) {
		setConstNumber(offset + 5, $id, value);
	}

	/**
	 * Column ID 項目ＩＤ.<p>
	 *
	 */
	public void id(int value) {
		setConstNumber(offset + 5, $id, value);
	}

	/**
	 * Column ID 項目ＩＤ.<p>
	 *
	 */
	public void id(long value) {
		setConstNumber(offset + 5, $id, value);
	}

	/**
	 * Column ID 項目ＩＤ.<p>
	 *
	 */
	public void id(float value) {
		setConstNumber(offset + 5, $id, value);
	}

	/**
	 * Column ID 項目ＩＤ.<p>
	 *
	 */
	public void id(double value) {
		setConstNumber(offset + 5, $id, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 6, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 6, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 6, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 6, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 6, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 6, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 7, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 7, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 7, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 7, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 7, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 7, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 8, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 8, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 8, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 8, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 8, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 8, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 9, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 9, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 9, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 9, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 9, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 9, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 10, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 10, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 10, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 10, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 10, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 10, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 11, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 11, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 11, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 11, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 11, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 11, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 12, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 12, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 12, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 12, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 12, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 12, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 13, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 13, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 13, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 13, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 13, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 13, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 14, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 14, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 14, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 14, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 14, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 14, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 15, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 15, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 15, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 15, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 15, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 15, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 16, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 16, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 16, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 16, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 16, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 16, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 17, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 17, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 17, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 17, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 17, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 17, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 18, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 18, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 18, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 18, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 18, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 18, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 19, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 19, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 19, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 19, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 19, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 19, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 20, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 20, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 20, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 20, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 20, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 20, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 21, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 21, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 21, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 21, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 21, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 21, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 22, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 22, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 22, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 22, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 22, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 22, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 23, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 23, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 23, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 23, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 23, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 23, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 24, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 24, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 24, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 24, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 24, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 24, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 25, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 25, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 25, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 25, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 25, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 25, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 26, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 26, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 26, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 26, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 26, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 26, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 27, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 27, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 27, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 27, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 27, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 27, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 28, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 28, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 28, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 28, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 28, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 28, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 29, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 29, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 29, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 29, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 29, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 29, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 30, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 30, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 30, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 30, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 30, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 30, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 31, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 31, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 31, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 31, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 31, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 31, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 32, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 32, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 32, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 32, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 32, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 32, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 33, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 33, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 33, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 33, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 33, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 33, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 34, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 34, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 34, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 34, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 34, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 34, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 35, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 35, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 35, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 35, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 35, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 35, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 36, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 36, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 36, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 36, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 36, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 36, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 37, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 37, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 37, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 37, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 37, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 37, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 38, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 38, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 38, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 38, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 38, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 38, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 39, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 39, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 39, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 39, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 39, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 39, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 40, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 40, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 40, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 40, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 40, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 40, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 41, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 41, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 41, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 41, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 41, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 41, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 42, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 42, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 42, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 42, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 42, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 42, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 43, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 43, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 43, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 43, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 43, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 43, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 44, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 44, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 44, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 44, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 44, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 44, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 45, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 45, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 45, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 45, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 45, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 45, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 46, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 46, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 46, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 46, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 46, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 46, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 47, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 47, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 47, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 47, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 47, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 47, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 48, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 48, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 48, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 48, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 48, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 48, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 49, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 49, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 49, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 49, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 49, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 49, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 50, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 50, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 50, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 50, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 50, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 50, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 51, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 51, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 51, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 51, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 51, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 51, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 52, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 52, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 52, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 52, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 52, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 52, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 53, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 53, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 53, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 53, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 53, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 53, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 54, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 54, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 54, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 54, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 54, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 54, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 55, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 55, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 55, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 55, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 55, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 55, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 56, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 56, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 56, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 56, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 56, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 56, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 57, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 57, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 57, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 57, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 57, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 57, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 58, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 58, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 58, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 58, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 58, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 58, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 59, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 59, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 59, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 59, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 59, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 59, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 60, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 60, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 60, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 60, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 60, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 60, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 61, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 61, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 61, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 61, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 61, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 61, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 62, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 62, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 62, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 62, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 62, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 62, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 63, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 63, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 63, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 63, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 63, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 63, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 64, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 64, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 64, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 64, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 64, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 64, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 65, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 65, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 65, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 65, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 65, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 65, $col_059, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 66, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 66, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 66, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 66, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 66, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 66, $ttl, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln() {
		return getConstNumber(offset + 67, $pln);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln(MCNumber value) {
		setConstNumber(offset + 67, $pln, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln(int value) {
		setConstNumber(offset + 67, $pln, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln(long value) {
		setConstNumber(offset + 67, $pln, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln(float value) {
		setConstNumber(offset + 67, $pln, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln(double value) {
		setConstNumber(offset + 67, $pln, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber diff() {
		return getConstNumber(offset + 68, $diff);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void diff(MCNumber value) {
		setConstNumber(offset + 68, $diff, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void diff(int value) {
		setConstNumber(offset + 68, $diff, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void diff(long value) {
		setConstNumber(offset + 68, $diff, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void diff(float value) {
		setConstNumber(offset + 68, $diff, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void diff(double value) {
		setConstNumber(offset + 68, $diff, value);
	}


	public String getString(String name) {
		if ($item.equalsIgnoreCase(name)) {
			return item();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($pln.equalsIgnoreCase(name)) {
			return pln();
		}
		if ($diff.equalsIgnoreCase(name)) {
			return diff();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($item.equalsIgnoreCase(name)) {
			return item();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($pln.equalsIgnoreCase(name)) {
			return pln();
		}
		if ($diff.equalsIgnoreCase(name)) {
			return diff();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($item.equalsIgnoreCase(name)) {
			item(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($item.equalsIgnoreCase(name)) {
			item(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($pln.equalsIgnoreCase(name)) {
			pln(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

