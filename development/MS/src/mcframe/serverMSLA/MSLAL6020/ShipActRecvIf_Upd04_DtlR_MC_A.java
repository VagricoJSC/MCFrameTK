package mcframe.serverMSLA.MSLAL6020;

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
 * ブロック"ShipActRecvIf_Upd04_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipActRecvIf_Upd04_DtlR_MC_A extends MCConstRow {

	public static final String $sa = "sa";
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public static final String $uplnd_flg = "uplnd_flg";
	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_dtl_peg_no = "hdr_dtl_peg_no";

	public static final String $data_lno = $sa + ".data_lno";
	public static final String $data_no = $sa + ".data_no";
	public static final String $ext_data_no = $sa + ".ext_data_no";
	public static final String $ext_data_lno = $sa + ".ext_data_lno";
	public static final String $exe_sts_typ = $sa + ".exe_sts_typ";
	public static final String $ship_fr_lg_grp_cd = $sa + ".ship_fr_lg_grp_cd";
	public static final String $ship_inst_no = $sa + ".ship_inst_no";

	public static final MCMeta sa_META = createInnerRowMeta($sa, mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R.class);
	public static final MCMeta uplnd_flg_META = createCommonMeta($uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_dtl_peg_no_META = createCommonMeta($hdr_dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<ShipActRecvIf_Upd04_DtlR> constMetas = new ConstMetaList<ShipActRecvIf_Upd04_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sa_META,
			uplnd_flg_META,
			hdr_dtl_peg_no_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_data_no",
				"ext_data_lno",
				"exe_sts_typ",
				"ship_fr_lg_grp_cd",
				"ship_inst_no"
			},
			{
				$data_lno,
				$data_no,
				$ext_data_no,
				$ext_data_lno,
				$exe_sts_typ,
				$ship_fr_lg_grp_cd,
				$ship_inst_no
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
	protected ShipActRecvIf_Upd04_DtlR_MC_A(ConstMetaList<? extends ShipActRecvIf_Upd04_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipActRecvIf_Upd04_DtlR clone() {
		return (ShipActRecvIf_Upd04_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipActRecvIf_Upd04_DtlR createInstance() {
		return (ShipActRecvIf_Upd04_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipActRecvIf_Upd04_DtlR getValues(String... names) {
		return (ShipActRecvIf_Upd04_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R sa(){
		return (mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R) getConstInnerRow(offset + 0, $sa);
	}
	
	public void sa(mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $sa, row);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return getConstBoolean(offset + 1, $uplnd_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		setConstBoolean(offset + 1, $uplnd_flg, value);
	}


	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg_no() {
		return getConstNumber(offset + 2, $hdr_dtl_peg_no);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(int value) {
		setConstNumber(offset + 2, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(long value) {
		setConstNumber(offset + 2, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(float value) {
		setConstNumber(offset + 2, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(double value) {
		setConstNumber(offset + 2, $hdr_dtl_peg_no, value);
	}


	public MCNumber getNumber(String name) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sa.equalsIgnoreCase(name)) {
			return sa();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sa.equalsIgnoreCase(name)) {
			sa(
				((MCContainerMeta) sa_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return sa().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		sa().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return sa().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		sa().data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return sa().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return sa().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		sa().ext_data_lno(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return sa().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		sa().exe_sts_typ(value);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return sa().ship_fr_lg_grp_cd();
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		sa().ship_fr_lg_grp_cd(value);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return sa().ship_inst_no();
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		sa().ship_inst_no(value);
	}

}

