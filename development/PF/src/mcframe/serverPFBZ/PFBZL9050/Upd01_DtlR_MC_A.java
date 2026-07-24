package mcframe.serverPFBZ.PFBZL9050;

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
 * ブロック"Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public static final String $sdrvIf = "sdrvIf";

	public static final String $data_no = $sdrvIf + ".data_no";
	public static final String $not_send_flg = $sdrvIf + ".not_send_flg";
	public static final String $not_send_upd_flg = $sdrvIf + ".not_send_upd_flg";
	public static final String $sdrv_if_rmrks = $sdrvIf + ".sdrv_if_rmrks";

	public static final MCMeta sdrvIf_META = createInnerRowMeta($sdrvIf, mcframe.serverPF.dbc.PFT_SDRV_IF_R.class);

	protected static final ConstMetaList<Upd01_DtlR> constMetas = new ConstMetaList<Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sdrvIf_META
		},
		new String[][]{
			{
				"data_no",
				"not_send_flg",
				"not_send_upd_flg",
				"sdrv_if_rmrks"
			},
			{
				$data_no,
				$not_send_flg,
				$not_send_upd_flg,
				$sdrv_if_rmrks
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
	protected Upd01_DtlR_MC_A(ConstMetaList<? extends Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR clone() {
		return (Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR createInstance() {
		return (Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR getValues(String... names) {
		return (Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_SDRV_IF_R sdrvIf(){
		return (mcframe.serverPF.dbc.PFT_SDRV_IF_R) getConstInnerRow(offset + 0, $sdrvIf);
	}
	
	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public void sdrvIf(mcframe.serverPF.dbc.PFT_SDRV_IF_R row){
		setConstInnerRow(offset + 0, $sdrvIf, row);
	}






	public MCRow getInnerRow(String name) {
		if ($sdrvIf.equalsIgnoreCase(name)) {
			return sdrvIf();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sdrvIf.equalsIgnoreCase(name)) {
			sdrvIf(
				((MCContainerMeta) sdrvIf_META).castInnerRow(mcframe.serverPF.dbc.PFT_SDRV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return sdrvIf().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Not to be exported 送信対象外.<p>
	 *
	 */
	public boolean not_send_flg() {
		return sdrvIf().not_send_flg();
	}

	/**
	 * Not to be exported 送信対象外.<p>
	 *
	 */
	public void not_send_flg(boolean value) {
		sdrvIf().not_send_flg(value);
	}

	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public boolean not_send_upd_flg() {
		return sdrvIf().not_send_upd_flg();
	}

	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public void not_send_upd_flg(boolean value) {
		sdrvIf().not_send_upd_flg(value);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String sdrv_if_rmrks() {
		return sdrvIf().sdrv_if_rmrks();
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void sdrv_if_rmrks(String value) {
		sdrvIf().sdrv_if_rmrks(value);
	}

}

