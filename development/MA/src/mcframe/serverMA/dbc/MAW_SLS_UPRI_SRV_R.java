package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "販売単価取得サービス用ワークテーブル // Work table for sales unit price acquisition service"DBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>peg_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>紐付けＮＯ</td>
 *  	<td>Pegging No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ１</td>
 *  	<td>Distribution channel cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ２</td>
 *  	<td>Distribution channel cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ３</td>
 *  	<td>Distribution channel cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単位ＣＤ</td>
 *  	<td>Unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量</td>
 *  	<td>Quantity</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準日</td>
 *  	<td>Base date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>grp_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>グループＮＯ</td>
 *  	<td>Group No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売単価</td>
 *  	<td>Sales unit price</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_sls_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準販売単価</td>
 *  	<td>Standard sales unit price</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準単価</td>
 *  	<td>Standard unit cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>interim_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仮単価ＦＬＧ</td>
 *  	<td>Temporary unit price flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売単価取得ＦＬＧ</td>
 *  	<td>Sales unit price acquisition flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_sls_upri_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準販売単価取得ＦＬＧ</td>
 *  	<td>Standard sales unit price acquisition flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_upri_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準単価取得ＦＬＧ</td>
 *  	<td>Standard unit cost acquisition flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_upri_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準単価ワーキンググループＣＤ</td>
 *  	<td>Standard unit cost WG cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_SLS_UPRI_SRV_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_SLS_UPRI_SRV";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	private static final MCPermColumnInfo _peg_no = createColumnInfo("peg_no");
	public final MCNumberPermColumn peg_no = createNumberColumn(_peg_no);
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	private static final MCPermColumnInfo _dest_cd1 = createColumnInfo("dest_cd1");
	public final MCStringPermColumn dest_cd1 = createStringColumn(_dest_cd1);
	
	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	private static final MCPermColumnInfo _dest_cd2 = createColumnInfo("dest_cd2");
	public final MCStringPermColumn dest_cd2 = createStringColumn(_dest_cd2);
	
	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	private static final MCPermColumnInfo _dest_cd3 = createColumnInfo("dest_cd3");
	public final MCStringPermColumn dest_cd3 = createStringColumn(_dest_cd3);
	
	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	private static final MCPermColumnInfo _unit_cd = createColumnInfo("unit_cd");
	public final MCStringPermColumn unit_cd = createStringColumn(_unit_cd);
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public static final String $qty = "qty";
	private static final MCPermColumnInfo _qty = createColumnInfo("qty");
	public final MCNumberPermColumn qty = createNumberColumn(_qty);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public static final String $dt = "dt";
	private static final MCPermColumnInfo _dt = createColumnInfo("dt");
	public final MCDatePermColumn dt = createDateColumn(_dt);
	
	/**
	 * グループＮＯ. Group No..<p>
	 *
	 */
	public static final String $grp_no = "grp_no";
	private static final MCPermColumnInfo _grp_no = createColumnInfo("grp_no");
	public final MCStringPermColumn grp_no = createStringColumn(_grp_no);
	
	/**
	 * 販売単価. Sales unit price.<p>
	 *
	 */
	public static final String $sls_upri = "sls_upri";
	private static final MCPermColumnInfo _sls_upri = createColumnInfo("sls_upri");
	public final MCNumberPermColumn sls_upri = createNumberColumn(_sls_upri);
	
	/**
	 * 標準販売単価. Standard sales unit price.<p>
	 *
	 */
	public static final String $std_sls_upri = "std_sls_upri";
	private static final MCPermColumnInfo _std_sls_upri = createColumnInfo("std_sls_upri");
	public final MCNumberPermColumn std_sls_upri = createNumberColumn(_std_sls_upri);
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	private static final MCPermColumnInfo _std_upri = createColumnInfo("std_upri");
	public final MCNumberPermColumn std_upri = createNumberColumn(_std_upri);
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	private static final MCPermColumnInfo _interim_flg = createColumnInfo("interim_flg");
	public final MCBooleanPermColumn interim_flg = createBooleanColumn(_interim_flg);
	
	/**
	 * 販売単価取得ＦＬＧ. Sales unit price acquisition flg..<p>
	 *
	 */
	public static final String $sls_upri_flg = "sls_upri_flg";
	private static final MCPermColumnInfo _sls_upri_flg = createColumnInfo("sls_upri_flg");
	public final MCBooleanPermColumn sls_upri_flg = createBooleanColumn(_sls_upri_flg);
	
	/**
	 * 標準販売単価取得ＦＬＧ. Standard sales unit price acquisition flg..<p>
	 *
	 */
	public static final String $std_sls_upri_flg = "std_sls_upri_flg";
	private static final MCPermColumnInfo _std_sls_upri_flg = createColumnInfo("std_sls_upri_flg");
	public final MCBooleanPermColumn std_sls_upri_flg = createBooleanColumn(_std_sls_upri_flg);
	
	/**
	 * 標準単価取得ＦＬＧ. Standard unit cost acquisition flg..<p>
	 *
	 */
	public static final String $std_upri_flg = "std_upri_flg";
	private static final MCPermColumnInfo _std_upri_flg = createColumnInfo("std_upri_flg");
	public final MCBooleanPermColumn std_upri_flg = createBooleanColumn(_std_upri_flg);
	
	/**
	 * 標準単価ワーキンググループＣＤ. Standard unit cost WG cd..<p>
	 *
	 */
	public static final String $std_upri_wg_cd = "std_upri_wg_cd";
	private static final MCPermColumnInfo _std_upri_wg_cd = createColumnInfo("std_upri_wg_cd");
	public final MCStringPermColumn std_upri_wg_cd = createStringColumn(_std_upri_wg_cd);
	
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta grp_no_META = createCommonMeta($grp_no, mcframe.commonMA.meta.MA_META.STR20);
	public static final MCMeta sls_upri_META = createCommonMeta($sls_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_sls_upri_META = createCommonMeta($std_sls_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_flg_META = createCommonMeta($sls_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_sls_upri_flg_META = createCommonMeta($std_sls_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_upri_flg_META = createCommonMeta($std_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_upri_wg_cd_META = createCommonMeta($std_upri_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAW_SLS_UPRI_SRV_R> constMetas = new ConstMetaList<MAW_SLS_UPRI_SRV_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			cst_cd_META,
			dlv_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			unit_cd_META,
			qty_META,
			cur_cd_META,
			wg_cd_META,
			dt_META,
			grp_no_META,
			sls_upri_META,
			std_sls_upri_META,
			std_upri_META,
			interim_flg_META,
			sls_upri_flg_META,
			std_sls_upri_flg_META,
			std_upri_flg_META,
			std_upri_wg_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected MAW_SLS_UPRI_SRV_R(ConstMetaList<? extends MAW_SLS_UPRI_SRV_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_SLS_UPRI_SRV_R(ConstMetaList<? extends MAW_SLS_UPRI_SRV_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$peg_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_SLS_UPRI_SRV_R.$peg_no,
				"peg_no",
				peg_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$cst_cd,
				"cst_cd",
				cst_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$dest_cd1,
				"dest_cd1",
				dest_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$dest_cd2,
				"dest_cd2",
				dest_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$dest_cd3,
				"dest_cd3",
				dest_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$unit_cd,
				"unit_cd",
				unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_SLS_UPRI_SRV_R.$qty,
				"qty",
				qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAW_SLS_UPRI_SRV_R.$dt,
				"dt",
				dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$grp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$grp_no,
				"grp_no",
				grp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$sls_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_SLS_UPRI_SRV_R.$sls_upri,
				"sls_upri",
				sls_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$std_sls_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_SLS_UPRI_SRV_R.$std_sls_upri,
				"std_sls_upri",
				std_sls_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$std_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_SLS_UPRI_SRV_R.$std_upri,
				"std_upri",
				std_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAW_SLS_UPRI_SRV_R.$interim_flg,
				"interim_flg",
				interim_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$sls_upri_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAW_SLS_UPRI_SRV_R.$sls_upri_flg,
				"sls_upri_flg",
				sls_upri_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$std_sls_upri_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAW_SLS_UPRI_SRV_R.$std_sls_upri_flg,
				"std_sls_upri_flg",
				std_sls_upri_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$std_upri_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAW_SLS_UPRI_SRV_R.$std_upri_flg,
				"std_upri_flg",
				std_upri_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_UPRI_SRV_R.$std_upri_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_UPRI_SRV_R.$std_upri_wg_cd,
				"std_upri_wg_cd",
				std_upri_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_SLS_UPRI_SRV_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_SLS_UPRI_SRV_R create(String alias) {
		MAW_SLS_UPRI_SRV_R row = new MAW_SLS_UPRI_SRV_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_SLS_UPRI_SRV_R createByName(T proto) {
		MAW_SLS_UPRI_SRV_R row = MAW_SLS_UPRI_SRV_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SLS_UPRI_SRV_R clone() {
		return (MAW_SLS_UPRI_SRV_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SLS_UPRI_SRV_R createInstance() {
		return (MAW_SLS_UPRI_SRV_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SLS_UPRI_SRV_R getValues(String... names) {
		return (MAW_SLS_UPRI_SRV_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 5, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 5, $cst_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 6, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 6, $dlv_cd, value);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 7, $dest_cd1);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 7, $dest_cd1, value);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 8, $dest_cd2);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 8, $dest_cd2, value);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 9, $dest_cd3);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 9, $dest_cd3, value);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 10, $unit_cd);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 10, $unit_cd, value);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 11, $qty);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 11, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 11, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 11, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 11, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 11, $qty, value);
	}
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 12, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 12, $cur_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 14, $dt);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 14, $dt, value);
	}

	/**
	 * グループＮＯ. Group No..<p>
	 *
	 */
	public String grp_no() {
		return getConstString(offset + 15, $grp_no);
	}

	/**
	 * グループＮＯ. Group No..<p>
	 *
	 */
	public void grp_no(String value) {
		setConstString(offset + 15, $grp_no, value);
	}

	/**
	 * 販売単価. Sales unit price.<p>
	 *
	 */
	public MCNumber sls_upri() {
		return getConstNumber(offset + 16, $sls_upri);
	}

	/**
	 * 販売単価. Sales unit price.<p>
	 *
	 */
	public void sls_upri(MCNumber value) {
		setConstNumber(offset + 16, $sls_upri, value);
	}
	
	/**
	 * 販売単価. Sales unit price.<p>
	 *
	 */
	public void sls_upri(int value) {
		setConstNumber(offset + 16, $sls_upri, value);
	}
	
	/**
	 * 販売単価. Sales unit price.<p>
	 *
	 */
	public void sls_upri(long value) {
		setConstNumber(offset + 16, $sls_upri, value);
	}
	
	/**
	 * 販売単価. Sales unit price.<p>
	 *
	 */
	public void sls_upri(float value) {
		setConstNumber(offset + 16, $sls_upri, value);
	}
	
	/**
	 * 販売単価. Sales unit price.<p>
	 *
	 */
	public void sls_upri(double value) {
		setConstNumber(offset + 16, $sls_upri, value);
	}
	
	/**
	 * 標準販売単価. Standard sales unit price.<p>
	 *
	 */
	public MCNumber std_sls_upri() {
		return getConstNumber(offset + 17, $std_sls_upri);
	}

	/**
	 * 標準販売単価. Standard sales unit price.<p>
	 *
	 */
	public void std_sls_upri(MCNumber value) {
		setConstNumber(offset + 17, $std_sls_upri, value);
	}
	
	/**
	 * 標準販売単価. Standard sales unit price.<p>
	 *
	 */
	public void std_sls_upri(int value) {
		setConstNumber(offset + 17, $std_sls_upri, value);
	}
	
	/**
	 * 標準販売単価. Standard sales unit price.<p>
	 *
	 */
	public void std_sls_upri(long value) {
		setConstNumber(offset + 17, $std_sls_upri, value);
	}
	
	/**
	 * 標準販売単価. Standard sales unit price.<p>
	 *
	 */
	public void std_sls_upri(float value) {
		setConstNumber(offset + 17, $std_sls_upri, value);
	}
	
	/**
	 * 標準販売単価. Standard sales unit price.<p>
	 *
	 */
	public void std_sls_upri(double value) {
		setConstNumber(offset + 17, $std_sls_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 18, $std_upri);
	}

	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 19, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 19, $interim_flg, value);
	}

	/**
	 * 販売単価取得ＦＬＧ. Sales unit price acquisition flg..<p>
	 *
	 */
	public boolean sls_upri_flg() {
		return getConstBoolean(offset + 20, $sls_upri_flg);
	}

	/**
	 * 販売単価取得ＦＬＧ. Sales unit price acquisition flg..<p>
	 *
	 */
	public void sls_upri_flg(boolean value) {
		setConstBoolean(offset + 20, $sls_upri_flg, value);
	}

	/**
	 * 標準販売単価取得ＦＬＧ. Standard sales unit price acquisition flg..<p>
	 *
	 */
	public boolean std_sls_upri_flg() {
		return getConstBoolean(offset + 21, $std_sls_upri_flg);
	}

	/**
	 * 標準販売単価取得ＦＬＧ. Standard sales unit price acquisition flg..<p>
	 *
	 */
	public void std_sls_upri_flg(boolean value) {
		setConstBoolean(offset + 21, $std_sls_upri_flg, value);
	}

	/**
	 * 標準単価取得ＦＬＧ. Standard unit cost acquisition flg..<p>
	 *
	 */
	public boolean std_upri_flg() {
		return getConstBoolean(offset + 22, $std_upri_flg);
	}

	/**
	 * 標準単価取得ＦＬＧ. Standard unit cost acquisition flg..<p>
	 *
	 */
	public void std_upri_flg(boolean value) {
		setConstBoolean(offset + 22, $std_upri_flg, value);
	}

	/**
	 * 標準単価ワーキンググループＣＤ. Standard unit cost WG cd..<p>
	 *
	 */
	public String std_upri_wg_cd() {
		return getConstString(offset + 23, $std_upri_wg_cd);
	}

	/**
	 * 標準単価ワーキンググループＣＤ. Standard unit cost WG cd..<p>
	 *
	 */
	public void std_upri_wg_cd(String value) {
		setConstString(offset + 23, $std_upri_wg_cd, value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($grp_no.equalsIgnoreCase(name)) {
			return grp_no();
		}
		if ($std_upri_wg_cd.equalsIgnoreCase(name)) {
			return std_upri_wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			return sls_upri();
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			return std_sls_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($sls_upri_flg.equalsIgnoreCase(name)) {
			return sls_upri_flg();
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			return std_sls_upri_flg();
		}
		if ($std_upri_flg.equalsIgnoreCase(name)) {
			return std_upri_flg();
		}
		return super.getBoolean(name);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($grp_no.equalsIgnoreCase(name)) {
			return grp_no();
		}
		if ($std_upri_wg_cd.equalsIgnoreCase(name)) {
			return std_upri_wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			return sls_upri();
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			return std_sls_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($sls_upri_flg.equalsIgnoreCase(name)) {
			return sls_upri_flg();
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			return std_sls_upri_flg();
		}
		if ($std_upri_flg.equalsIgnoreCase(name)) {
			return std_upri_flg();
		}
		return super.getBooleanNE(name);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($grp_no.equalsIgnoreCase(name)) {
			grp_no(value);
			return;
		}
		if ($std_upri_wg_cd.equalsIgnoreCase(name)) {
			std_upri_wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($sls_upri_flg.equalsIgnoreCase(name)) {
			sls_upri_flg(value);
			return;
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			std_sls_upri_flg(value);
			return;
		}
		if ($std_upri_flg.equalsIgnoreCase(name)) {
			std_upri_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($grp_no.equalsIgnoreCase(name)) {
			grp_no(value);
			return;
		}
		if ($std_upri_wg_cd.equalsIgnoreCase(name)) {
			std_upri_wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($std_sls_upri.equalsIgnoreCase(name)) {
			std_sls_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($sls_upri_flg.equalsIgnoreCase(name)) {
			sls_upri_flg(value);
			return;
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			std_sls_upri_flg(value);
			return;
		}
		if ($std_upri_flg.equalsIgnoreCase(name)) {
			std_upri_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
