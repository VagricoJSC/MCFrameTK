package mcframe.serverMSBF.MSBFL5050;

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
 * ブロック"InspAct_Upd02_ReInspSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspAct_Upd02_ReInspSchdR_MC_A extends MCConstRow {

	public static final String $re_insp_schd = "re_insp_schd";

	public static final String $insp_schd_no = $re_insp_schd + ".insp_schd_no";
	public static final String $own_insp_schd_no = $re_insp_schd + ".own_insp_schd_no";
	public static final String $own_insp_no = $re_insp_schd + ".own_insp_no";
	public static final String $st_tm = $re_insp_schd + ".st_tm";
	public static final String $end_tm = $re_insp_schd + ".end_tm";
	public static final String $smpl_inst_qty = $re_insp_schd + ".smpl_inst_qty";
	public static final String $latest_flg = $re_insp_schd + ".latest_flg";
	public static final String $insp_freq = $re_insp_schd + ".insp_freq";
	public static final String $insp_schd_sts_typ = $re_insp_schd + ".insp_schd_sts_typ";
	public static final String $insp_no = $re_insp_schd + ".insp_no";
	public static final String $insp_cnt_rmrks = $re_insp_schd + ".insp_cnt_rmrks";

	public static final MCMeta re_insp_schd_META = createInnerRowMeta($re_insp_schd, mcframe.serverMS.dbc.MST_INSP_SCHD_R.class);

	protected static final ConstMetaList<InspAct_Upd02_ReInspSchdR> constMetas = new ConstMetaList<InspAct_Upd02_ReInspSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			re_insp_schd_META
		},
		new String[][]{
			{
				"insp_schd_no",
				"own_insp_schd_no",
				"own_insp_no",
				"st_tm",
				"end_tm",
				"smpl_inst_qty",
				"latest_flg",
				"insp_freq",
				"insp_schd_sts_typ",
				"insp_no",
				"insp_cnt_rmrks"
			},
			{
				$insp_schd_no,
				$own_insp_schd_no,
				$own_insp_no,
				$st_tm,
				$end_tm,
				$smpl_inst_qty,
				$latest_flg,
				$insp_freq,
				$insp_schd_sts_typ,
				$insp_no,
				$insp_cnt_rmrks
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
	protected InspAct_Upd02_ReInspSchdR_MC_A(ConstMetaList<? extends InspAct_Upd02_ReInspSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspAct_Upd02_ReInspSchdR clone() {
		return (InspAct_Upd02_ReInspSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspAct_Upd02_ReInspSchdR createInstance() {
		return (InspAct_Upd02_ReInspSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspAct_Upd02_ReInspSchdR getValues(String... names) {
		return (InspAct_Upd02_ReInspSchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_INSP_SCHD_R re_insp_schd(){
		return (mcframe.serverMS.dbc.MST_INSP_SCHD_R) getConstInnerRow(offset + 0, $re_insp_schd);
	}
	
	public void re_insp_schd(mcframe.serverMS.dbc.MST_INSP_SCHD_R row){
		setConstInnerRow(offset + 0, $re_insp_schd, row);
	}






	public MCRow getInnerRow(String name) {
		if ($re_insp_schd.equalsIgnoreCase(name)) {
			return re_insp_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($re_insp_schd.equalsIgnoreCase(name)) {
			re_insp_schd(
				((MCContainerMeta) re_insp_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_INSP_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return re_insp_schd().insp_schd_no();
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		re_insp_schd().insp_schd_no(value);
	}

	/**
	 * Reference inspection schedule No. 参照検査予定ＮＯ.<p>
	 *
	 */
	public String own_insp_schd_no() {
		return re_insp_schd().own_insp_schd_no();
	}

	/**
	 * Reference inspection schedule No. 参照検査予定ＮＯ.<p>
	 *
	 */
	public void own_insp_schd_no(String value) {
		re_insp_schd().own_insp_schd_no(value);
	}

	/**
	 * Reference inspection No. 参照検査ＮＯ.<p>
	 *
	 */
	public String own_insp_no() {
		return re_insp_schd().own_insp_no();
	}

	/**
	 * Reference inspection No. 参照検査ＮＯ.<p>
	 *
	 */
	public void own_insp_no(String value) {
		re_insp_schd().own_insp_no(value);
	}

	/**
	 * Scheduled inspection start date and time 検査開始予定日時.<p>
	 *
	 */
	public MCDate st_tm() {
		return re_insp_schd().st_tm();
	}

	/**
	 * Scheduled inspection start date and time 検査開始予定日時.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		re_insp_schd().st_tm(value);
	}

	/**
	 * Scheduled inspection end date and time 検査終了予定日時.<p>
	 *
	 */
	public MCDate end_tm() {
		return re_insp_schd().end_tm();
	}

	/**
	 * Scheduled inspection end date and time 検査終了予定日時.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		re_insp_schd().end_tm(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return re_insp_schd().smpl_inst_qty();
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		re_insp_schd().smpl_inst_qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		re_insp_schd().smpl_inst_qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		re_insp_schd().smpl_inst_qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		re_insp_schd().smpl_inst_qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		re_insp_schd().smpl_inst_qty(value);
	}

	/**
	 * Latest flg. 最新フラグ.<p>
	 *
	 */
	public boolean latest_flg() {
		return re_insp_schd().latest_flg();
	}

	/**
	 * Latest flg. 最新フラグ.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		re_insp_schd().latest_flg(value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return re_insp_schd().insp_freq();
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		re_insp_schd().insp_freq(value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(int value) {
		re_insp_schd().insp_freq(value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(long value) {
		re_insp_schd().insp_freq(value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(float value) {
		re_insp_schd().insp_freq(value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(double value) {
		re_insp_schd().insp_freq(value);
	}

	/**
	 * Inspection schedule status type 検査予定状況区分.<p>
	 *
	 */
	public String insp_schd_sts_typ() {
		return re_insp_schd().insp_schd_sts_typ();
	}

	/**
	 * Inspection schedule status type 検査予定状況区分.<p>
	 *
	 */
	public void insp_schd_sts_typ(String value) {
		re_insp_schd().insp_schd_sts_typ(value);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return re_insp_schd().insp_no();
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		re_insp_schd().insp_no(value);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return re_insp_schd().insp_cnt_rmrks();
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		re_insp_schd().insp_cnt_rmrks(value);
	}

}

