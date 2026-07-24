package mcframe.serverMSBE.MSBEL5090;

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
 * ブロック"ShipStkRpl_Cnt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipStkRpl_CntR_MC_A extends MCConstRow {

	/**
	 * Deleted number of shortage info. 不足情報の削除件数.<p>
	 *
	 */
	public static final String $lst_del_cnt = "lst_del_cnt";
	/**
	 * Deleted number of movement/transport schedule 移動移送予定削除件数.<p>
	 *
	 */
	public static final String $xfr_del_cnt = "xfr_del_cnt";
	/**
	 * Number of GR/GI schedule for shipping 出荷の受払予定件数.<p>
	 *
	 */
	public static final String $ship_io_schd_cnt = "ship_io_schd_cnt";
	/**
	 * Created number of shortage info. 不足情報の作成件数.<p>
	 *
	 */
	public static final String $lst_crt_cnt = "lst_crt_cnt";
	/**
	 * Number of missing info. deleted due to movement/transport schedule creation 移動移送予定作成に伴い削除した不足情報の件数.<p>
	 *
	 */
	public static final String $lst_del_of_xfr_crt_cnt = "lst_del_of_xfr_crt_cnt";
	/**
	 * Created number of movement/transport schedule 移動移送予定作成件数.<p>
	 *
	 */
	public static final String $xfr_crt_success_cnt = "xfr_crt_success_cnt";
	/**
	 * Error count during movement/transport schedule creating 移動移送予定作成エラー件数.<p>
	 *
	 */
	public static final String $xfr_crt_error_cnt = "xfr_crt_error_cnt";


	public static final MCMeta lst_del_cnt_META = createCommonMeta($lst_del_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xfr_del_cnt_META = createCommonMeta($xfr_del_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_io_schd_cnt_META = createCommonMeta($ship_io_schd_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lst_crt_cnt_META = createCommonMeta($lst_crt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lst_del_of_xfr_crt_cnt_META = createCommonMeta($lst_del_of_xfr_crt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xfr_crt_success_cnt_META = createCommonMeta($xfr_crt_success_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xfr_crt_error_cnt_META = createCommonMeta($xfr_crt_error_cnt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<ShipStkRpl_CntR> constMetas = new ConstMetaList<ShipStkRpl_CntR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lst_del_cnt_META,
			xfr_del_cnt_META,
			ship_io_schd_cnt_META,
			lst_crt_cnt_META,
			lst_del_of_xfr_crt_cnt_META,
			xfr_crt_success_cnt_META,
			xfr_crt_error_cnt_META
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
	protected ShipStkRpl_CntR_MC_A(ConstMetaList<? extends ShipStkRpl_CntR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipStkRpl_CntR clone() {
		return (ShipStkRpl_CntR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipStkRpl_CntR createInstance() {
		return (ShipStkRpl_CntR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipStkRpl_CntR getValues(String... names) {
		return (ShipStkRpl_CntR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Deleted number of shortage info. 不足情報の削除件数.<p>
	 *
	 */
	public MCNumber lst_del_cnt() {
		return getConstNumber(offset + 0, $lst_del_cnt);
	}

	/**
	 * Deleted number of shortage info. 不足情報の削除件数.<p>
	 *
	 */
	public void lst_del_cnt(MCNumber value) {
		setConstNumber(offset + 0, $lst_del_cnt, value);
	}

	/**
	 * Deleted number of shortage info. 不足情報の削除件数.<p>
	 *
	 */
	public void lst_del_cnt(int value) {
		setConstNumber(offset + 0, $lst_del_cnt, value);
	}

	/**
	 * Deleted number of shortage info. 不足情報の削除件数.<p>
	 *
	 */
	public void lst_del_cnt(long value) {
		setConstNumber(offset + 0, $lst_del_cnt, value);
	}

	/**
	 * Deleted number of shortage info. 不足情報の削除件数.<p>
	 *
	 */
	public void lst_del_cnt(float value) {
		setConstNumber(offset + 0, $lst_del_cnt, value);
	}

	/**
	 * Deleted number of shortage info. 不足情報の削除件数.<p>
	 *
	 */
	public void lst_del_cnt(double value) {
		setConstNumber(offset + 0, $lst_del_cnt, value);
	}


	/**
	 * Deleted number of movement/transport schedule 移動移送予定削除件数.<p>
	 *
	 */
	public MCNumber xfr_del_cnt() {
		return getConstNumber(offset + 1, $xfr_del_cnt);
	}

	/**
	 * Deleted number of movement/transport schedule 移動移送予定削除件数.<p>
	 *
	 */
	public void xfr_del_cnt(MCNumber value) {
		setConstNumber(offset + 1, $xfr_del_cnt, value);
	}

	/**
	 * Deleted number of movement/transport schedule 移動移送予定削除件数.<p>
	 *
	 */
	public void xfr_del_cnt(int value) {
		setConstNumber(offset + 1, $xfr_del_cnt, value);
	}

	/**
	 * Deleted number of movement/transport schedule 移動移送予定削除件数.<p>
	 *
	 */
	public void xfr_del_cnt(long value) {
		setConstNumber(offset + 1, $xfr_del_cnt, value);
	}

	/**
	 * Deleted number of movement/transport schedule 移動移送予定削除件数.<p>
	 *
	 */
	public void xfr_del_cnt(float value) {
		setConstNumber(offset + 1, $xfr_del_cnt, value);
	}

	/**
	 * Deleted number of movement/transport schedule 移動移送予定削除件数.<p>
	 *
	 */
	public void xfr_del_cnt(double value) {
		setConstNumber(offset + 1, $xfr_del_cnt, value);
	}


	/**
	 * Number of GR/GI schedule for shipping 出荷の受払予定件数.<p>
	 *
	 */
	public MCNumber ship_io_schd_cnt() {
		return getConstNumber(offset + 2, $ship_io_schd_cnt);
	}

	/**
	 * Number of GR/GI schedule for shipping 出荷の受払予定件数.<p>
	 *
	 */
	public void ship_io_schd_cnt(MCNumber value) {
		setConstNumber(offset + 2, $ship_io_schd_cnt, value);
	}

	/**
	 * Number of GR/GI schedule for shipping 出荷の受払予定件数.<p>
	 *
	 */
	public void ship_io_schd_cnt(int value) {
		setConstNumber(offset + 2, $ship_io_schd_cnt, value);
	}

	/**
	 * Number of GR/GI schedule for shipping 出荷の受払予定件数.<p>
	 *
	 */
	public void ship_io_schd_cnt(long value) {
		setConstNumber(offset + 2, $ship_io_schd_cnt, value);
	}

	/**
	 * Number of GR/GI schedule for shipping 出荷の受払予定件数.<p>
	 *
	 */
	public void ship_io_schd_cnt(float value) {
		setConstNumber(offset + 2, $ship_io_schd_cnt, value);
	}

	/**
	 * Number of GR/GI schedule for shipping 出荷の受払予定件数.<p>
	 *
	 */
	public void ship_io_schd_cnt(double value) {
		setConstNumber(offset + 2, $ship_io_schd_cnt, value);
	}


	/**
	 * Created number of shortage info. 不足情報の作成件数.<p>
	 *
	 */
	public MCNumber lst_crt_cnt() {
		return getConstNumber(offset + 3, $lst_crt_cnt);
	}

	/**
	 * Created number of shortage info. 不足情報の作成件数.<p>
	 *
	 */
	public void lst_crt_cnt(MCNumber value) {
		setConstNumber(offset + 3, $lst_crt_cnt, value);
	}

	/**
	 * Created number of shortage info. 不足情報の作成件数.<p>
	 *
	 */
	public void lst_crt_cnt(int value) {
		setConstNumber(offset + 3, $lst_crt_cnt, value);
	}

	/**
	 * Created number of shortage info. 不足情報の作成件数.<p>
	 *
	 */
	public void lst_crt_cnt(long value) {
		setConstNumber(offset + 3, $lst_crt_cnt, value);
	}

	/**
	 * Created number of shortage info. 不足情報の作成件数.<p>
	 *
	 */
	public void lst_crt_cnt(float value) {
		setConstNumber(offset + 3, $lst_crt_cnt, value);
	}

	/**
	 * Created number of shortage info. 不足情報の作成件数.<p>
	 *
	 */
	public void lst_crt_cnt(double value) {
		setConstNumber(offset + 3, $lst_crt_cnt, value);
	}


	/**
	 * Number of missing info. deleted due to movement/transport schedule creation 移動移送予定作成に伴い削除した不足情報の件数.<p>
	 *
	 */
	public MCNumber lst_del_of_xfr_crt_cnt() {
		return getConstNumber(offset + 4, $lst_del_of_xfr_crt_cnt);
	}

	/**
	 * Number of missing info. deleted due to movement/transport schedule creation 移動移送予定作成に伴い削除した不足情報の件数.<p>
	 *
	 */
	public void lst_del_of_xfr_crt_cnt(MCNumber value) {
		setConstNumber(offset + 4, $lst_del_of_xfr_crt_cnt, value);
	}

	/**
	 * Number of missing info. deleted due to movement/transport schedule creation 移動移送予定作成に伴い削除した不足情報の件数.<p>
	 *
	 */
	public void lst_del_of_xfr_crt_cnt(int value) {
		setConstNumber(offset + 4, $lst_del_of_xfr_crt_cnt, value);
	}

	/**
	 * Number of missing info. deleted due to movement/transport schedule creation 移動移送予定作成に伴い削除した不足情報の件数.<p>
	 *
	 */
	public void lst_del_of_xfr_crt_cnt(long value) {
		setConstNumber(offset + 4, $lst_del_of_xfr_crt_cnt, value);
	}

	/**
	 * Number of missing info. deleted due to movement/transport schedule creation 移動移送予定作成に伴い削除した不足情報の件数.<p>
	 *
	 */
	public void lst_del_of_xfr_crt_cnt(float value) {
		setConstNumber(offset + 4, $lst_del_of_xfr_crt_cnt, value);
	}

	/**
	 * Number of missing info. deleted due to movement/transport schedule creation 移動移送予定作成に伴い削除した不足情報の件数.<p>
	 *
	 */
	public void lst_del_of_xfr_crt_cnt(double value) {
		setConstNumber(offset + 4, $lst_del_of_xfr_crt_cnt, value);
	}


	/**
	 * Created number of movement/transport schedule 移動移送予定作成件数.<p>
	 *
	 */
	public MCNumber xfr_crt_success_cnt() {
		return getConstNumber(offset + 5, $xfr_crt_success_cnt);
	}

	/**
	 * Created number of movement/transport schedule 移動移送予定作成件数.<p>
	 *
	 */
	public void xfr_crt_success_cnt(MCNumber value) {
		setConstNumber(offset + 5, $xfr_crt_success_cnt, value);
	}

	/**
	 * Created number of movement/transport schedule 移動移送予定作成件数.<p>
	 *
	 */
	public void xfr_crt_success_cnt(int value) {
		setConstNumber(offset + 5, $xfr_crt_success_cnt, value);
	}

	/**
	 * Created number of movement/transport schedule 移動移送予定作成件数.<p>
	 *
	 */
	public void xfr_crt_success_cnt(long value) {
		setConstNumber(offset + 5, $xfr_crt_success_cnt, value);
	}

	/**
	 * Created number of movement/transport schedule 移動移送予定作成件数.<p>
	 *
	 */
	public void xfr_crt_success_cnt(float value) {
		setConstNumber(offset + 5, $xfr_crt_success_cnt, value);
	}

	/**
	 * Created number of movement/transport schedule 移動移送予定作成件数.<p>
	 *
	 */
	public void xfr_crt_success_cnt(double value) {
		setConstNumber(offset + 5, $xfr_crt_success_cnt, value);
	}


	/**
	 * Error count during movement/transport schedule creating 移動移送予定作成エラー件数.<p>
	 *
	 */
	public MCNumber xfr_crt_error_cnt() {
		return getConstNumber(offset + 6, $xfr_crt_error_cnt);
	}

	/**
	 * Error count during movement/transport schedule creating 移動移送予定作成エラー件数.<p>
	 *
	 */
	public void xfr_crt_error_cnt(MCNumber value) {
		setConstNumber(offset + 6, $xfr_crt_error_cnt, value);
	}

	/**
	 * Error count during movement/transport schedule creating 移動移送予定作成エラー件数.<p>
	 *
	 */
	public void xfr_crt_error_cnt(int value) {
		setConstNumber(offset + 6, $xfr_crt_error_cnt, value);
	}

	/**
	 * Error count during movement/transport schedule creating 移動移送予定作成エラー件数.<p>
	 *
	 */
	public void xfr_crt_error_cnt(long value) {
		setConstNumber(offset + 6, $xfr_crt_error_cnt, value);
	}

	/**
	 * Error count during movement/transport schedule creating 移動移送予定作成エラー件数.<p>
	 *
	 */
	public void xfr_crt_error_cnt(float value) {
		setConstNumber(offset + 6, $xfr_crt_error_cnt, value);
	}

	/**
	 * Error count during movement/transport schedule creating 移動移送予定作成エラー件数.<p>
	 *
	 */
	public void xfr_crt_error_cnt(double value) {
		setConstNumber(offset + 6, $xfr_crt_error_cnt, value);
	}


	public MCNumber getNumber(String name) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			return lst_del_cnt();
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			return xfr_del_cnt();
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			return ship_io_schd_cnt();
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			return lst_crt_cnt();
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			return lst_del_of_xfr_crt_cnt();
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			return xfr_crt_success_cnt();
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			return xfr_crt_error_cnt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			return lst_del_cnt();
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			return xfr_del_cnt();
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			return ship_io_schd_cnt();
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			return lst_crt_cnt();
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			return lst_del_of_xfr_crt_cnt();
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			return xfr_crt_success_cnt();
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			return xfr_crt_error_cnt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($lst_del_cnt.equalsIgnoreCase(name)) {
			lst_del_cnt(value);
			return;
		}
		if ($xfr_del_cnt.equalsIgnoreCase(name)) {
			xfr_del_cnt(value);
			return;
		}
		if ($ship_io_schd_cnt.equalsIgnoreCase(name)) {
			ship_io_schd_cnt(value);
			return;
		}
		if ($lst_crt_cnt.equalsIgnoreCase(name)) {
			lst_crt_cnt(value);
			return;
		}
		if ($lst_del_of_xfr_crt_cnt.equalsIgnoreCase(name)) {
			lst_del_of_xfr_crt_cnt(value);
			return;
		}
		if ($xfr_crt_success_cnt.equalsIgnoreCase(name)) {
			xfr_crt_success_cnt(value);
			return;
		}
		if ($xfr_crt_error_cnt.equalsIgnoreCase(name)) {
			xfr_crt_error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

