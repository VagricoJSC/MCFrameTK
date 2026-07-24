package mcframe.serverMAUC.MAUCL0060;

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
 * ブロック"Args"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArgsR_MC_A extends MCConstRow {

	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	/**
	 * Argument for numbering 発番用引数.<p>
	 *
	 */
	public static final String $elm_args = "elm_args";

	public static final String $num_ptn_cd = $elm_args + ".num_ptn_cd";
	public static final String $itm_cd = $elm_args + ".itm_cd";
	public static final String $itm_sub1 = $elm_args + ".itm_sub1";
	public static final String $itm_sub2 = $elm_args + ".itm_sub2";
	public static final String $itm_sub3 = $elm_args + ".itm_sub3";
	public static final String $loc_cd = $elm_args + ".loc_cd";
	public static final String $dpt_cd = $elm_args + ".dpt_cd";
	public static final String $co_cd = $elm_args + ".co_cd";
	public static final String $bp_cd = $elm_args + ".bp_cd";
	public static final String $wg_cd = $elm_args + ".wg_cd";
	public static final String $trd_cd = $elm_args + ".trd_cd";
	public static final String $site_cd = $elm_args + ".site_cd";
	public static final String $lot_no = $elm_args + ".lot_no";
	public static final String $chd_lot_no = $elm_args + ".chd_lot_no";
	public static final String $chd_sublot_no = $elm_args + ".chd_sublot_no";
	public static final String $bp_lot_no = $elm_args + ".bp_lot_no";
	public static final String $sno1 = $elm_args + ".sno1";
	public static final String $sno2 = $elm_args + ".sno2";
	public static final String $sno3 = $elm_args + ".sno3";
	public static final String $sno4 = $elm_args + ".sno4";
	public static final String $dt = $elm_args + ".dt";
	public static final String $str = $elm_args + ".str";
	public static final String $str2 = $elm_args + ".str2";
	public static final String $str3 = $elm_args + ".str3";
	public static final String $num = $elm_args + ".num";
	public static final String $itm_cd_label_nm = $elm_args + ".itm_cd_label_nm";
	public static final String $itm_sub1_label_nm = $elm_args + ".itm_sub1_label_nm";
	public static final String $itm_sub2_label_nm = $elm_args + ".itm_sub2_label_nm";
	public static final String $itm_sub3_label_nm = $elm_args + ".itm_sub3_label_nm";
	public static final String $loc_cd_label_nm = $elm_args + ".loc_cd_label_nm";
	public static final String $dpt_cd_label_nm = $elm_args + ".dpt_cd_label_nm";
	public static final String $co_cd_label_nm = $elm_args + ".co_cd_label_nm";
	public static final String $bp_cd_label_nm = $elm_args + ".bp_cd_label_nm";
	public static final String $wg_cd_label_nm = $elm_args + ".wg_cd_label_nm";
	public static final String $site_cd_label_nm = $elm_args + ".site_cd_label_nm";
	public static final String $lot_no_label_nm = $elm_args + ".lot_no_label_nm";
	public static final String $chd_lot_no_label_nm = $elm_args + ".chd_lot_no_label_nm";
	public static final String $chd_sublot_no_label_nm = $elm_args + ".chd_sublot_no_label_nm";
	public static final String $bp_lot_no_label_nm = $elm_args + ".bp_lot_no_label_nm";
	public static final String $sno1_label_nm = $elm_args + ".sno1_label_nm";
	public static final String $sno2_label_nm = $elm_args + ".sno2_label_nm";
	public static final String $sno3_label_nm = $elm_args + ".sno3_label_nm";
	public static final String $sno4_label_nm = $elm_args + ".sno4_label_nm";
	public static final String $trd_cd_label_nm = $elm_args + ".trd_cd_label_nm";
	public static final String $dt_label_nm = $elm_args + ".dt_label_nm";
	public static final String $str_label_nm = $elm_args + ".str_label_nm";
	public static final String $str2_label_nm = $elm_args + ".str2_label_nm";
	public static final String $str3_label_nm = $elm_args + ".str3_label_nm";
	public static final String $num_label_nm = $elm_args + ".num_label_nm";

	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta elm_args_META = createInnerRowMeta($elm_args, mcframe.serverMAUC.MAUCL0060.ElmArgsR.class);

	protected static final ConstMetaList<ArgsR> constMetas = new ConstMetaList<ArgsR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			elm_args_META
		},
		new String[][]{
			{
				"num_ptn_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"loc_cd",
				"dpt_cd",
				"co_cd",
				"bp_cd",
				"wg_cd",
				"trd_cd",
				"site_cd",
				"lot_no",
				"chd_lot_no",
				"chd_sublot_no",
				"bp_lot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"dt",
				"str",
				"str2",
				"str3",
				"num",
				"itm_cd_label_nm",
				"itm_sub1_label_nm",
				"itm_sub2_label_nm",
				"itm_sub3_label_nm",
				"loc_cd_label_nm",
				"dpt_cd_label_nm",
				"co_cd_label_nm",
				"bp_cd_label_nm",
				"wg_cd_label_nm",
				"site_cd_label_nm",
				"lot_no_label_nm",
				"chd_lot_no_label_nm",
				"chd_sublot_no_label_nm",
				"bp_lot_no_label_nm",
				"sno1_label_nm",
				"sno2_label_nm",
				"sno3_label_nm",
				"sno4_label_nm",
				"trd_cd_label_nm",
				"dt_label_nm",
				"str_label_nm",
				"str2_label_nm",
				"str3_label_nm",
				"num_label_nm"
			},
			{
				$num_ptn_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$loc_cd,
				$dpt_cd,
				$co_cd,
				$bp_cd,
				$wg_cd,
				$trd_cd,
				$site_cd,
				$lot_no,
				$chd_lot_no,
				$chd_sublot_no,
				$bp_lot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$dt,
				$str,
				$str2,
				$str3,
				$num,
				$itm_cd_label_nm,
				$itm_sub1_label_nm,
				$itm_sub2_label_nm,
				$itm_sub3_label_nm,
				$loc_cd_label_nm,
				$dpt_cd_label_nm,
				$co_cd_label_nm,
				$bp_cd_label_nm,
				$wg_cd_label_nm,
				$site_cd_label_nm,
				$lot_no_label_nm,
				$chd_lot_no_label_nm,
				$chd_sublot_no_label_nm,
				$bp_lot_no_label_nm,
				$sno1_label_nm,
				$sno2_label_nm,
				$sno3_label_nm,
				$sno4_label_nm,
				$trd_cd_label_nm,
				$dt_label_nm,
				$str_label_nm,
				$str2_label_nm,
				$str3_label_nm,
				$num_label_nm
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
	protected ArgsR_MC_A(ConstMetaList<? extends ArgsR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArgsR clone() {
		return (ArgsR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArgsR createInstance() {
		return (ArgsR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArgsR getValues(String... names) {
		return (ArgsR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public String num_biz_typ() {
		return getConstString(offset + 0, $num_biz_typ);
	}

	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public void num_biz_typ(String value) {
		setConstString(offset + 0, $num_biz_typ, value);
	}


	/**
	 * Argument for numbering 発番用引数.<p>
	 *
	 */
	public mcframe.serverMAUC.MAUCL0060.ElmArgsR elm_args(){
		return (mcframe.serverMAUC.MAUCL0060.ElmArgsR) getConstInnerRow(offset + 1, $elm_args);
	}
	
	/**
	 * Argument for numbering 発番用引数.<p>
	 *
	 */
	public void elm_args(mcframe.serverMAUC.MAUCL0060.ElmArgsR row){
		setConstInnerRow(offset + 1, $elm_args, row);
	}


	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($elm_args.equalsIgnoreCase(name)) {
			return elm_args();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($elm_args.equalsIgnoreCase(name)) {
			elm_args(
				((MCContainerMeta) elm_args_META).castInnerRow(mcframe.serverMAUC.MAUCL0060.ElmArgsR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public String num_ptn_cd() {
		return elm_args().num_ptn_cd();
	}

	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		elm_args().num_ptn_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return elm_args().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		elm_args().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return elm_args().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		elm_args().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return elm_args().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		elm_args().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return elm_args().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		elm_args().itm_sub3(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return elm_args().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		elm_args().loc_cd(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return elm_args().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		elm_args().dpt_cd(value);
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return elm_args().co_cd();
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		elm_args().co_cd(value);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return elm_args().bp_cd();
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		elm_args().bp_cd(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return elm_args().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		elm_args().wg_cd(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return elm_args().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		elm_args().trd_cd(value);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return elm_args().site_cd();
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		elm_args().site_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return elm_args().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		elm_args().lot_no(value);
	}

	/**
	 * Child item lot No. 子品目ロットＮＯ.<p>
	 *
	 */
	public String chd_lot_no() {
		return elm_args().chd_lot_no();
	}

	/**
	 * Child item lot No. 子品目ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_no(String value) {
		elm_args().chd_lot_no(value);
	}

	/**
	 * Child item sublot No. 子品目サブロットＮＯ.<p>
	 *
	 */
	public String chd_sublot_no() {
		return elm_args().chd_sublot_no();
	}

	/**
	 * Child item sublot No. 子品目サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		elm_args().chd_sublot_no(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return elm_args().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		elm_args().bp_lot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return elm_args().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		elm_args().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return elm_args().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		elm_args().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return elm_args().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		elm_args().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return elm_args().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		elm_args().sno4(value);
	}

	/**
	 * Date 日付.<p>
	 *
	 */
	public MCDate dt() {
		return elm_args().dt();
	}

	/**
	 * Date 日付.<p>
	 *
	 */
	public void dt(MCDate value) {
		elm_args().dt(value);
	}

	/**
	 * String 文字列.<p>
	 *
	 */
	public String str() {
		return elm_args().str();
	}

	/**
	 * String 文字列.<p>
	 *
	 */
	public void str(String value) {
		elm_args().str(value);
	}

	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public String str2() {
		return elm_args().str2();
	}

	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public void str2(String value) {
		elm_args().str2(value);
	}

	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public String str3() {
		return elm_args().str3();
	}

	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public void str3(String value) {
		elm_args().str3(value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public MCNumber num() {
		return elm_args().num();
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(MCNumber value) {
		elm_args().num(value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(int value) {
		elm_args().num(value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(long value) {
		elm_args().num(value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(float value) {
		elm_args().num(value);
	}

	/**
	 * Number 数字.<p>
	 *
	 */
	public void num(double value) {
		elm_args().num(value);
	}

	/**
	 * Item cd._label name 品目ＣＤ_ラベル名.<p>
	 *
	 */
	public String itm_cd_label_nm() {
		return elm_args().itm_cd_label_nm();
	}

	/**
	 * Item cd._label name 品目ＣＤ_ラベル名.<p>
	 *
	 */
	public void itm_cd_label_nm(String value) {
		elm_args().itm_cd_label_nm(value);
	}

	/**
	 * Branch No. 1_label name 枝番１_ラベル名.<p>
	 *
	 */
	public String itm_sub1_label_nm() {
		return elm_args().itm_sub1_label_nm();
	}

	/**
	 * Branch No. 1_label name 枝番１_ラベル名.<p>
	 *
	 */
	public void itm_sub1_label_nm(String value) {
		elm_args().itm_sub1_label_nm(value);
	}

	/**
	 * Branch No. 2_label name 枝番２_ラベル名.<p>
	 *
	 */
	public String itm_sub2_label_nm() {
		return elm_args().itm_sub2_label_nm();
	}

	/**
	 * Branch No. 2_label name 枝番２_ラベル名.<p>
	 *
	 */
	public void itm_sub2_label_nm(String value) {
		elm_args().itm_sub2_label_nm(value);
	}

	/**
	 * Branch No. 3_label name 枝番３_ラベル名.<p>
	 *
	 */
	public String itm_sub3_label_nm() {
		return elm_args().itm_sub3_label_nm();
	}

	/**
	 * Branch No. 3_label name 枝番３_ラベル名.<p>
	 *
	 */
	public void itm_sub3_label_nm(String value) {
		elm_args().itm_sub3_label_nm(value);
	}

	/**
	 * Location cd._label name 場所ＣＤ_ラベル名.<p>
	 *
	 */
	public String loc_cd_label_nm() {
		return elm_args().loc_cd_label_nm();
	}

	/**
	 * Location cd._label name 場所ＣＤ_ラベル名.<p>
	 *
	 */
	public void loc_cd_label_nm(String value) {
		elm_args().loc_cd_label_nm(value);
	}

	/**
	 * Dept. cd._label name 部門ＣＤ_ラベル名.<p>
	 *
	 */
	public String dpt_cd_label_nm() {
		return elm_args().dpt_cd_label_nm();
	}

	/**
	 * Dept. cd._label name 部門ＣＤ_ラベル名.<p>
	 *
	 */
	public void dpt_cd_label_nm(String value) {
		elm_args().dpt_cd_label_nm(value);
	}

	/**
	 * Company cd._label name 会社ＣＤ_ラベル名.<p>
	 *
	 */
	public String co_cd_label_nm() {
		return elm_args().co_cd_label_nm();
	}

	/**
	 * Company cd._label name 会社ＣＤ_ラベル名.<p>
	 *
	 */
	public void co_cd_label_nm(String value) {
		elm_args().co_cd_label_nm(value);
	}

	/**
	 * BP cd._label name 取引先ＣＤ_ラベル名.<p>
	 *
	 */
	public String bp_cd_label_nm() {
		return elm_args().bp_cd_label_nm();
	}

	/**
	 * BP cd._label name 取引先ＣＤ_ラベル名.<p>
	 *
	 */
	public void bp_cd_label_nm(String value) {
		elm_args().bp_cd_label_nm(value);
	}

	/**
	 * WG cd._label name ワーキンググループＣＤ_ラベル名.<p>
	 *
	 */
	public String wg_cd_label_nm() {
		return elm_args().wg_cd_label_nm();
	}

	/**
	 * WG cd._label name ワーキンググループＣＤ_ラベル名.<p>
	 *
	 */
	public void wg_cd_label_nm(String value) {
		elm_args().wg_cd_label_nm(value);
	}

	/**
	 * Factory/Distribution warehouse cd._label name 工場・物流倉庫ＣＤ_ラベル名.<p>
	 *
	 */
	public String site_cd_label_nm() {
		return elm_args().site_cd_label_nm();
	}

	/**
	 * Factory/Distribution warehouse cd._label name 工場・物流倉庫ＣＤ_ラベル名.<p>
	 *
	 */
	public void site_cd_label_nm(String value) {
		elm_args().site_cd_label_nm(value);
	}

	/**
	 * Lot No._label name ロットＮＯ_ラベル名.<p>
	 *
	 */
	public String lot_no_label_nm() {
		return elm_args().lot_no_label_nm();
	}

	/**
	 * Lot No._label name ロットＮＯ_ラベル名.<p>
	 *
	 */
	public void lot_no_label_nm(String value) {
		elm_args().lot_no_label_nm(value);
	}

	/**
	 * Child item lot No._label name 子品目ロットＮＯ_ラベル名.<p>
	 *
	 */
	public String chd_lot_no_label_nm() {
		return elm_args().chd_lot_no_label_nm();
	}

	/**
	 * Child item lot No._label name 子品目ロットＮＯ_ラベル名.<p>
	 *
	 */
	public void chd_lot_no_label_nm(String value) {
		elm_args().chd_lot_no_label_nm(value);
	}

	/**
	 * Child item sublot No._label name 子品目サブロットＮＯ_ラベル名.<p>
	 *
	 */
	public String chd_sublot_no_label_nm() {
		return elm_args().chd_sublot_no_label_nm();
	}

	/**
	 * Child item sublot No._label name 子品目サブロットＮＯ_ラベル名.<p>
	 *
	 */
	public void chd_sublot_no_label_nm(String value) {
		elm_args().chd_sublot_no_label_nm(value);
	}

	/**
	 * Vendor Lot No._label name 業者ロットＮＯ_ラベル名.<p>
	 *
	 */
	public String bp_lot_no_label_nm() {
		return elm_args().bp_lot_no_label_nm();
	}

	/**
	 * Vendor Lot No._label name 業者ロットＮＯ_ラベル名.<p>
	 *
	 */
	public void bp_lot_no_label_nm(String value) {
		elm_args().bp_lot_no_label_nm(value);
	}

	/**
	 * SEIBAN No. 1_label name 手配ＮＯ１_ラベル名.<p>
	 *
	 */
	public String sno1_label_nm() {
		return elm_args().sno1_label_nm();
	}

	/**
	 * SEIBAN No. 1_label name 手配ＮＯ１_ラベル名.<p>
	 *
	 */
	public void sno1_label_nm(String value) {
		elm_args().sno1_label_nm(value);
	}

	/**
	 * SEIBAN No. 2_label name 手配ＮＯ２_ラベル名.<p>
	 *
	 */
	public String sno2_label_nm() {
		return elm_args().sno2_label_nm();
	}

	/**
	 * SEIBAN No. 2_label name 手配ＮＯ２_ラベル名.<p>
	 *
	 */
	public void sno2_label_nm(String value) {
		elm_args().sno2_label_nm(value);
	}

	/**
	 * SEIBAN No. 3_label name 手配ＮＯ３_ラベル名.<p>
	 *
	 */
	public String sno3_label_nm() {
		return elm_args().sno3_label_nm();
	}

	/**
	 * SEIBAN No. 3_label name 手配ＮＯ３_ラベル名.<p>
	 *
	 */
	public void sno3_label_nm(String value) {
		elm_args().sno3_label_nm(value);
	}

	/**
	 * SEIBAN No. 4_label name 手配ＮＯ４_ラベル名.<p>
	 *
	 */
	public String sno4_label_nm() {
		return elm_args().sno4_label_nm();
	}

	/**
	 * SEIBAN No. 4_label name 手配ＮＯ４_ラベル名.<p>
	 *
	 */
	public void sno4_label_nm(String value) {
		elm_args().sno4_label_nm(value);
	}

	/**
	 * Transaction cd._label name 取引ＣＤ_ラベル名.<p>
	 *
	 */
	public String trd_cd_label_nm() {
		return elm_args().trd_cd_label_nm();
	}

	/**
	 * Transaction cd._label name 取引ＣＤ_ラベル名.<p>
	 *
	 */
	public void trd_cd_label_nm(String value) {
		elm_args().trd_cd_label_nm(value);
	}

	/**
	 * Date_label name 日付_ラベル名.<p>
	 *
	 */
	public String dt_label_nm() {
		return elm_args().dt_label_nm();
	}

	/**
	 * Date_label name 日付_ラベル名.<p>
	 *
	 */
	public void dt_label_nm(String value) {
		elm_args().dt_label_nm(value);
	}

	/**
	 * String_label name 文字列_ラベル名.<p>
	 *
	 */
	public String str_label_nm() {
		return elm_args().str_label_nm();
	}

	/**
	 * String_label name 文字列_ラベル名.<p>
	 *
	 */
	public void str_label_nm(String value) {
		elm_args().str_label_nm(value);
	}

	/**
	 * String 2_label name 文字列２_ラベル名.<p>
	 *
	 */
	public String str2_label_nm() {
		return elm_args().str2_label_nm();
	}

	/**
	 * String 2_label name 文字列２_ラベル名.<p>
	 *
	 */
	public void str2_label_nm(String value) {
		elm_args().str2_label_nm(value);
	}

	/**
	 * String 3_label name 文字列３_ラベル名.<p>
	 *
	 */
	public String str3_label_nm() {
		return elm_args().str3_label_nm();
	}

	/**
	 * String 3_label name 文字列３_ラベル名.<p>
	 *
	 */
	public void str3_label_nm(String value) {
		elm_args().str3_label_nm(value);
	}

	/**
	 * Number_label name 数字_ラベル名.<p>
	 *
	 */
	public String num_label_nm() {
		return elm_args().num_label_nm();
	}

	/**
	 * Number_label name 数字_ラベル名.<p>
	 *
	 */
	public void num_label_nm(String value) {
		elm_args().num_label_nm(value);
	}

}

