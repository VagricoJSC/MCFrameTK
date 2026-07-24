package mcframe.serverMSLA.MSLAL8220;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSLAL_YieldActRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_YieldActRecvConvService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL8220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_YieldActRecvConvService.YieldActRecvConv_Conv01 aYieldActRecvConv_Conv01;

	protected void initYieldActRecvConv_Conv01() {
		this.info = PDef.MS_MSLAL8220_YieldActRecvConv_Conv01_INFO;
		this.aYieldActRecvConv_Conv01 = ((MSLAL_YieldActRecvConvService)this).new YieldActRecvConv_Conv01();
	}

	public static MSLAL_YieldActRecvConvService.YieldActRecvConv_Conv01 crtYieldActRecvConv_Conv01() {
		MSLAL_YieldActRecvConvService lgc = new MSLAL_YieldActRecvConvService();
		lgc.initYieldActRecvConv_Conv01();
		return lgc.aYieldActRecvConv_Conv01;
	}

	protected void paramYieldActRecvConv_Conv01(MCParam p) {
		if (this.aYieldActRecvConv_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aYieldActRecvConv_Conv01.up0());
		p.addDownBlock(aYieldActRecvConv_Conv01.down0());
	}

	protected void doYieldActRecvConv_Conv01() {
		aYieldActRecvConv_Conv01.call();
	};
	protected MSLAL_YieldActRecvConvService.YieldActRecvConv_Conv02 aYieldActRecvConv_Conv02;

	protected void initYieldActRecvConv_Conv02() {
		this.info = PDef.MS_MSLAL8220_YieldActRecvConv_Conv02_INFO;
		this.aYieldActRecvConv_Conv02 = ((MSLAL_YieldActRecvConvService)this).new YieldActRecvConv_Conv02();
	}

	public static MSLAL_YieldActRecvConvService.YieldActRecvConv_Conv02 crtYieldActRecvConv_Conv02() {
		MSLAL_YieldActRecvConvService lgc = new MSLAL_YieldActRecvConvService();
		lgc.initYieldActRecvConv_Conv02();
		return lgc.aYieldActRecvConv_Conv02;
	}

	protected void paramYieldActRecvConv_Conv02(MCParam p) {
		if (this.aYieldActRecvConv_Conv02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aYieldActRecvConv_Conv02.up0());
		p.addDownBlock(aYieldActRecvConv_Conv02.down0());
	}

	protected void doYieldActRecvConv_Conv02() {
		aYieldActRecvConv_Conv02.call();
	};
	protected MSLAL_YieldActRecvConvService.YieldActRecvConv_Conv03 aYieldActRecvConv_Conv03;

	protected void initYieldActRecvConv_Conv03() {
		this.info = PDef.MS_MSLAL8220_YieldActRecvConv_Conv03_INFO;
		this.aYieldActRecvConv_Conv03 = ((MSLAL_YieldActRecvConvService)this).new YieldActRecvConv_Conv03();
	}

	public static MSLAL_YieldActRecvConvService.YieldActRecvConv_Conv03 crtYieldActRecvConv_Conv03() {
		MSLAL_YieldActRecvConvService lgc = new MSLAL_YieldActRecvConvService();
		lgc.initYieldActRecvConv_Conv03();
		return lgc.aYieldActRecvConv_Conv03;
	}

	protected void paramYieldActRecvConv_Conv03(MCParam p) {
		if (this.aYieldActRecvConv_Conv03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aYieldActRecvConv_Conv03.up0());
		p.addUpBlock(aYieldActRecvConv_Conv03.up1());
		p.addDownBlock(aYieldActRecvConv_Conv03.down0());
	}

	protected void doYieldActRecvConv_Conv03() {
		aYieldActRecvConv_Conv03.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.commonMSLA.MSLAR1220.DtlR createDtlR(){
		return mcframe.commonMSLA.MSLAR1220.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.commonMSLA.MSLAR1220.DtlR> createDtlL(){
		return MCList.create(mcframe.commonMSLA.MSLAR1220.DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * YieldActRecvConv_Conv01オペレーション.<p>
	 *
	 */
	abstract public class YieldActRecvConv_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "YieldActRecvConv_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected YieldActRecvConv_Conv01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_YieldActRecvConvService)MSLAL_YieldActRecvConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_YieldActRecvConvService)MSLAL_YieldActRecvConvService_MC_A.this).info;
		}


	}
	/**
	 * YieldActRecvConv_Conv02オペレーション.<p>
	 *
	 */
	abstract public class YieldActRecvConv_Conv02 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "YieldActRecvConv_Conv02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected YieldActRecvConv_Conv02() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_YieldActRecvConvService)MSLAL_YieldActRecvConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_YieldActRecvConvService)MSLAL_YieldActRecvConvService_MC_A.this).info;
		}


	}
	/**
	 * YieldActRecvConv_Conv03オペレーション.<p>
	 *
	 */
	abstract public class YieldActRecvConv_Conv03 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase06 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "YieldActRecvConv_Conv03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.commonMSLA.MSLAR1220.DtlR> up1;
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected YieldActRecvConv_Conv03() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			up1 = MCList.create(mcframe.commonMSLA.MSLAR1220.DtlR.class);
			// down0 の初期化は、superOperationのコンストラクタで行います。

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_YieldActRecvConvService)MSLAL_YieldActRecvConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.commonMSLA.MSLAR1220.DtlR createDtlR(){
			return mcframe.commonMSLA.MSLAR1220.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.commonMSLA.MSLAR1220.DtlR> createDtlL(){
			return MCList.create(mcframe.commonMSLA.MSLAR1220.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//
		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>trd_typ_cd</td></tr>
		 * 	<tr><td><br></td><td>data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>all_oper_act_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>co_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * 	<tr><td><br></td><td>sub_char17</td></tr>
		 * 	<tr><td><br></td><td>sub_char18</td></tr>
		 * 	<tr><td><br></td><td>sub_char19</td></tr>
		 * 	<tr><td><br></td><td>sub_char20</td></tr>
		 * 	<tr><td><br></td><td>sub_char21</td></tr>
		 * 	<tr><td><br></td><td>sub_char22</td></tr>
		 * 	<tr><td><br></td><td>sub_char23</td></tr>
		 * 	<tr><td><br></td><td>sub_char24</td></tr>
		 * 	<tr><td><br></td><td>sub_char25</td></tr>
		 * 	<tr><td><br></td><td>sub_char26</td></tr>
		 * 	<tr><td><br></td><td>sub_char27</td></tr>
		 * 	<tr><td><br></td><td>sub_char28</td></tr>
		 * 	<tr><td><br></td><td>sub_char29</td></tr>
		 * 	<tr><td><br></td><td>sub_char30</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_num4</td></tr>
		 * 	<tr><td><br></td><td>sub_num5</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>sub_dt5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.commonMSLA.MSLAR1220.DtlR> up1() {
			return up1;
		}


		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_YieldActRecvConvService)MSLAL_YieldActRecvConvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}