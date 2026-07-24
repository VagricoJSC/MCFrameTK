package mcframe.serverMSBF.MSBFL5060;

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
 * "MSBFL_StdInspActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_StdInspActRcptIFService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL5060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_StdInspActRcptIFService.StdInspActIF_Upd01 aStdInspActIF_Upd01;

	protected void initStdInspActIF_Upd01() {
		this.info = PDef.MS_MSBFL5060_StdInspActIF_Upd01_INFO;
		this.aStdInspActIF_Upd01 = ((MSBFL_StdInspActRcptIFService)this).new StdInspActIF_Upd01();
	}

	public static MSBFL_StdInspActRcptIFService.StdInspActIF_Upd01 crtStdInspActIF_Upd01() {
		MSBFL_StdInspActRcptIFService lgc = new MSBFL_StdInspActRcptIFService();
		lgc.initStdInspActIF_Upd01();
		return lgc.aStdInspActIF_Upd01;
	}

	protected void paramStdInspActIF_Upd01(MCParam p) {
		if (this.aStdInspActIF_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspActIF_Upd01.up0());
		p.addUpBlock(aStdInspActIF_Upd01.up1());
		p.addUpBlock(aStdInspActIF_Upd01.up2());
		p.addDownBlock(aStdInspActIF_Upd01.down0());
	}

	protected void doStdInspActIF_Upd01() {
		aStdInspActIF_Upd01.call();
	};

	/**
	 * StdInspActIF_Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR createStdInspActIF_Upd01_CtrlR(){
		return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR.create();
	}

	/**
	 * StdInspActIF_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR createStdInspActIF_Upd01_HdrR(){
		return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.create();
	}

	/**
	 * StdInspActIF_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> createStdInspActIF_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.class);
	}

	/**
	 * StdInspActIF_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR createStdInspActIF_Upd01_DtlR(){
		return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR.create();
	}

	/**
	 * StdInspActIF_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR> createStdInspActIF_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR.class);
	}
	protected MSBFL_StdInspActRcptIFService.StdInspActIF_Del01 aStdInspActIF_Del01;

	protected void initStdInspActIF_Del01() {
		this.info = PDef.MS_MSBFL5060_StdInspActIF_Del01_INFO;
		this.aStdInspActIF_Del01 = ((MSBFL_StdInspActRcptIFService)this).new StdInspActIF_Del01();
	}

	public static MSBFL_StdInspActRcptIFService.StdInspActIF_Del01 crtStdInspActIF_Del01() {
		MSBFL_StdInspActRcptIFService lgc = new MSBFL_StdInspActRcptIFService();
		lgc.initStdInspActIF_Del01();
		return lgc.aStdInspActIF_Del01;
	}

	protected void paramStdInspActIF_Del01(MCParam p) {
		if (this.aStdInspActIF_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspActIF_Del01.up0());
		p.addUpBlock(aStdInspActIF_Del01.up1());
	}

	protected void doStdInspActIF_Del01() {
		aStdInspActIF_Del01.call();
	};

	/**
	 * StdInspActIF_Del01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR createStdInspActIF_Del01_CtrlR(){
		return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR.create();
	}

	/**
	 * StdInspActIF_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR createStdInspActIF_Del01_HdrR(){
		return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.create();
	}

	/**
	 * StdInspActIF_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> createStdInspActIF_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * StdInspActIF_Upd01オペレーション.<p>
	 *
	 * 規格検査の実績を登録・更新する。<br>
	 */
	abstract public class StdInspActIF_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspActIF_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected StdInspActIF_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_StdInspActRcptIFService)MSBFL_StdInspActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * StdInspActIF_Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR createStdInspActIF_Upd01_CtrlR(){
			return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR.create();
		}

		/**
		 * StdInspActIF_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR createStdInspActIF_Upd01_HdrR(){
			return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.create();
		}

		/**
		 * StdInspActIF_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> createStdInspActIF_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.class);
		}

		/**
		 * StdInspActIF_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR createStdInspActIF_Upd01_DtlR(){
			return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR.create();
		}

		/**
		 * StdInspActIF_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR> createStdInspActIF_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR
		 */
		public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>qn_insp_val</td></tr>
		 * 	<tr><td><br></td><td>qn_insp_val_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ql_insp_val</td></tr>
		 * 	<tr><td><br></td><td>ql_insp_val_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>st_tm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActRcptIFService)MSBFL_StdInspActRcptIFService_MC_A.this).info;
		}


	}
	/**
	 * StdInspActIF_Del01オペレーション.<p>
	 *
	 * 規格検査の実績を取り消す。<br>
	 */
	abstract public class StdInspActIF_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspActIF_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> up1;
		
		
		// コンストラクタ
		protected StdInspActIF_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_StdInspActRcptIFService)MSBFL_StdInspActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdInspActIF_Del01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR createStdInspActIF_Del01_CtrlR(){
			return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR.create();
		}

		/**
		 * StdInspActIF_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR createStdInspActIF_Del01_HdrR(){
			return mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.create();
		}

		/**
		 * StdInspActIF_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> createStdInspActIF_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR
		 */
		public mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5060.StdInspActIF_Upd01_HdrR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActRcptIFService)MSBFL_StdInspActRcptIFService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}