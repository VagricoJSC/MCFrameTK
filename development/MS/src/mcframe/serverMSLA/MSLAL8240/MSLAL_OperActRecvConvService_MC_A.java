package mcframe.serverMSLA.MSLAL8240;

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
 * "MSLAL_OperActRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_OperActRecvConvService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String LOGIC_ID = "MSLAL8240";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_OperActRecvConvService.OperActRecvConv_Conv01 aOperActRecvConv_Conv01;

	protected void initOperActRecvConv_Conv01() {
		this.info = PDef.MS_MSLAL8240_OperActRecvConv_Conv01_INFO;
		this.aOperActRecvConv_Conv01 = ((MSLAL_OperActRecvConvService)this).new OperActRecvConv_Conv01();
	}

	public static MSLAL_OperActRecvConvService.OperActRecvConv_Conv01 crtOperActRecvConv_Conv01() {
		MSLAL_OperActRecvConvService lgc = new MSLAL_OperActRecvConvService();
		lgc.initOperActRecvConv_Conv01();
		return lgc.aOperActRecvConv_Conv01;
	}

	protected void paramOperActRecvConv_Conv01(MCParam p) {
		if (this.aOperActRecvConv_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOperActRecvConv_Conv01.up0());
		p.addDownBlock(aOperActRecvConv_Conv01.down0());
	}

	protected void doOperActRecvConv_Conv01() {
		aOperActRecvConv_Conv01.call();
	};
	protected MSLAL_OperActRecvConvService.OperActRecvConv_Conv02 aOperActRecvConv_Conv02;

	protected void initOperActRecvConv_Conv02() {
		this.info = PDef.MS_MSLAL8240_OperActRecvConv_Conv02_INFO;
		this.aOperActRecvConv_Conv02 = ((MSLAL_OperActRecvConvService)this).new OperActRecvConv_Conv02();
	}

	public static MSLAL_OperActRecvConvService.OperActRecvConv_Conv02 crtOperActRecvConv_Conv02() {
		MSLAL_OperActRecvConvService lgc = new MSLAL_OperActRecvConvService();
		lgc.initOperActRecvConv_Conv02();
		return lgc.aOperActRecvConv_Conv02;
	}

	protected void paramOperActRecvConv_Conv02(MCParam p) {
		if (this.aOperActRecvConv_Conv02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOperActRecvConv_Conv02.up0());
		p.addDownBlock(aOperActRecvConv_Conv02.down0());
	}

	protected void doOperActRecvConv_Conv02() {
		aOperActRecvConv_Conv02.call();
	};
	protected MSLAL_OperActRecvConvService.OperActRecvConv_Conv03 aOperActRecvConv_Conv03;

	protected void initOperActRecvConv_Conv03() {
		this.info = PDef.MS_MSLAL8240_OperActRecvConv_Conv03_INFO;
		this.aOperActRecvConv_Conv03 = ((MSLAL_OperActRecvConvService)this).new OperActRecvConv_Conv03();
	}

	public static MSLAL_OperActRecvConvService.OperActRecvConv_Conv03 crtOperActRecvConv_Conv03() {
		MSLAL_OperActRecvConvService lgc = new MSLAL_OperActRecvConvService();
		lgc.initOperActRecvConv_Conv03();
		return lgc.aOperActRecvConv_Conv03;
	}

	protected void paramOperActRecvConv_Conv03(MCParam p) {
		if (this.aOperActRecvConv_Conv03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOperActRecvConv_Conv03.up0());
		p.addUpBlock(aOperActRecvConv_Conv03.up1());
		p.addDownBlock(aOperActRecvConv_Conv03.down0());
	}

	protected void doOperActRecvConv_Conv03() {
		aOperActRecvConv_Conv03.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.commonMSLA.MSLAR1240.DtlR createDtlR(){
		return mcframe.commonMSLA.MSLAR1240.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.commonMSLA.MSLAR1240.DtlR> createDtlL(){
		return MCList.create(mcframe.commonMSLA.MSLAR1240.DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OperActRecvConv_Conv01オペレーション.<p>
	 *
	 */
	abstract public class OperActRecvConv_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OperActRecvConv_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected OperActRecvConv_Conv01() {
			
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
			invoke((MSLAL_OperActRecvConvService)MSLAL_OperActRecvConvService_MC_A.this);
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
			return ((MSLAL_OperActRecvConvService)MSLAL_OperActRecvConvService_MC_A.this).info;
		}


	}
	/**
	 * OperActRecvConv_Conv02オペレーション.<p>
	 *
	 */
	abstract public class OperActRecvConv_Conv02 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OperActRecvConv_Conv02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected OperActRecvConv_Conv02() {
			
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
			invoke((MSLAL_OperActRecvConvService)MSLAL_OperActRecvConvService_MC_A.this);
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
			return ((MSLAL_OperActRecvConvService)MSLAL_OperActRecvConvService_MC_A.this).info;
		}


	}
	/**
	 * OperActRecvConv_Conv03オペレーション.<p>
	 *
	 */
	abstract public class OperActRecvConv_Conv03 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase06 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OperActRecvConv_Conv03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.commonMSLA.MSLAR1240.DtlR> up1;
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected OperActRecvConv_Conv03() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			up1 = MCList.create(mcframe.commonMSLA.MSLAR1240.DtlR.class);
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
			invoke((MSLAL_OperActRecvConvService)MSLAL_OperActRecvConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.commonMSLA.MSLAR1240.DtlR createDtlR(){
			return mcframe.commonMSLA.MSLAR1240.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.commonMSLA.MSLAR1240.DtlR> createDtlL(){
			return MCList.create(mcframe.commonMSLA.MSLAR1240.DtlR.class);
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
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * 	<tr><td><br></td><td>st_act_hm</td></tr>
		 * 	<tr><td><br></td><td>end_act_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_hm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
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
		public MCList<mcframe.commonMSLA.MSLAR1240.DtlR> up1() {
			return up1;
		}


		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OperActRecvConvService)MSLAL_OperActRecvConvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}