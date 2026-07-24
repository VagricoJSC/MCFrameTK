package mcframe.serverMAUC.MAUCL1060;

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
 * ブロック"Trd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TrdR_MC_A extends MCConstRow {

	/**
	 * Transaction info. 取引情報.<p>
	 *
	 */
	public static final String $trd = "trd";

	public static final String $trd_cd = $trd + ".trd_cd";
	public static final String $trd_nm = $trd + ".trd_nm";
	public static final String $trd_ptn_typ = $trd + ".trd_ptn_typ";
	public static final String $ac_rsn_cd = $trd + ".ac_rsn_cd";
	public static final String $slip_each_lot_typ = $trd + ".slip_each_lot_typ";
	public static final String $slip_form_cd = $trd + ".slip_form_cd";
	public static final String $auto_adopt_flg = $trd + ".auto_adopt_flg";
	public static final String $memo1 = $trd + ".memo1";
	public static final String $memo2 = $trd + ".memo2";
	public static final String $memo3 = $trd + ".memo3";

	public static final MCMeta trd_META = createInnerRowMeta($trd, mcframe.serverMA.dbc.MAM_TRD_R.class);

	protected static final ConstMetaList<TrdR> constMetas = new ConstMetaList<TrdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_META
		},
		new String[][]{
			{
				"trd_cd",
				"trd_nm",
				"trd_ptn_typ",
				"ac_rsn_cd",
				"slip_each_lot_typ",
				"slip_form_cd",
				"auto_adopt_flg",
				"memo1",
				"memo2",
				"memo3"
			},
			{
				$trd_cd,
				$trd_nm,
				$trd_ptn_typ,
				$ac_rsn_cd,
				$slip_each_lot_typ,
				$slip_form_cd,
				$auto_adopt_flg,
				$memo1,
				$memo2,
				$memo3
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
	protected TrdR_MC_A(ConstMetaList<? extends TrdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TrdR clone() {
		return (TrdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TrdR createInstance() {
		return (TrdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TrdR getValues(String... names) {
		return (TrdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transaction info. 取引情報.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_TRD_R trd(){
		return (mcframe.serverMA.dbc.MAM_TRD_R) getConstInnerRow(offset + 0, $trd);
	}
	
	/**
	 * Transaction info. 取引情報.<p>
	 *
	 */
	public void trd(mcframe.serverMA.dbc.MAM_TRD_R row){
		setConstInnerRow(offset + 0, $trd, row);
	}






	public MCRow getInnerRow(String name) {
		if ($trd.equalsIgnoreCase(name)) {
			return trd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($trd.equalsIgnoreCase(name)) {
			trd(
				((MCContainerMeta) trd_META).castInnerRow(mcframe.serverMA.dbc.MAM_TRD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return trd().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		trd().trd_cd(value);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return trd().trd_nm();
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		trd().trd_nm(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return trd().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		trd().trd_ptn_typ(value);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return trd().ac_rsn_cd();
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		trd().ac_rsn_cd(value);
	}

	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return trd().slip_each_lot_typ();
	}

	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		trd().slip_each_lot_typ(value);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String slip_form_cd() {
		return trd().slip_form_cd();
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void slip_form_cd(String value) {
		trd().slip_form_cd(value);
	}

	/**
	 * Adopt at auto flg. 自動時採用ＦＬＧ.<p>
	 *
	 */
	public boolean auto_adopt_flg() {
		return trd().auto_adopt_flg();
	}

	/**
	 * Adopt at auto flg. 自動時採用ＦＬＧ.<p>
	 *
	 */
	public void auto_adopt_flg(boolean value) {
		trd().auto_adopt_flg(value);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return trd().memo1();
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		trd().memo1(value);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return trd().memo2();
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		trd().memo2(value);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return trd().memo3();
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		trd().memo3(value);
	}

}

