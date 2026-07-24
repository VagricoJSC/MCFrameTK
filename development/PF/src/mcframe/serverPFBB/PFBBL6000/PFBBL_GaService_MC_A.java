package mcframe.serverPFBB.PFBBL6000;

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
 * "PFBBL_GaService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBBL_GaService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBBL6000";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBBL_GaService.Recv_Chk01 aRecv_Chk01;

	protected void initRecv_Chk01() {
		this.info = PDef.PF_PFBBL6000_Recv_Chk01_INFO;
		this.aRecv_Chk01 = ((PFBBL_GaService)this).new Recv_Chk01();
	}

	public static PFBBL_GaService.Recv_Chk01 crtRecv_Chk01() {
		PFBBL_GaService lgc = new PFBBL_GaService();
		lgc.initRecv_Chk01();
		return lgc.aRecv_Chk01;
	}

	protected void paramRecv_Chk01(MCParam p) {
		if (this.aRecv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRecv_Chk01.up0());
		p.addDownBlock(aRecv_Chk01.down0());
	}

	protected void doRecv_Chk01() {
		aRecv_Chk01.call();
	};

	/**
	 * Recv_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBB.PFBBL6000.Recv_DtlR createRecv_DtlR(){
		return mcframe.serverPFBB.PFBBL6000.Recv_DtlR.create();
	}
	protected PFBBL_GaService.Recv_Upd01 aRecv_Upd01;

	protected void initRecv_Upd01() {
		this.info = PDef.PF_PFBBL6000_Recv_Upd01_INFO;
		this.aRecv_Upd01 = ((PFBBL_GaService)this).new Recv_Upd01();
	}

	public static PFBBL_GaService.Recv_Upd01 crtRecv_Upd01() {
		PFBBL_GaService lgc = new PFBBL_GaService();
		lgc.initRecv_Upd01();
		return lgc.aRecv_Upd01;
	}

	protected void paramRecv_Upd01(MCParam p) {
		if (this.aRecv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRecv_Upd01.up0());
	}

	protected void doRecv_Upd01() {
		aRecv_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Recv_Chk01オペレーション.<p>
	 *
	 * 受信前チェック<br>
	 */
	abstract public class Recv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Recv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBB.PFBBL6000.Recv_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBB.PFBBL6000.Recv_DtlR down0;
		
		
		// コンストラクタ
		protected Recv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBB.PFBBL6000.Recv_DtlR.create();
			down0 = mcframe.serverPFBB.PFBBL6000.Recv_DtlR.create();

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
			invoke((PFBBL_GaService)PFBBL_GaService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Recv_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBB.PFBBL6000.Recv_DtlR createRecv_DtlR(){
			return mcframe.serverPFBB.PFBBL6000.Recv_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>budgetcode</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBB.PFBBL6000.Recv_DtlR
		 */
		public mcframe.serverPFBB.PFBBL6000.Recv_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBB.PFBBL6000.Recv_DtlR
		 */
		public mcframe.serverPFBB.PFBBL6000.Recv_DtlR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBBL_GaService)PFBBL_GaService_MC_A.this).info;
		}


	}
	/**
	 * Recv_Upd01オペレーション.<p>
	 *
	 * ＧＡのAPIを呼び出し、受信変換処理を実行する。<br>
	 */
	abstract public class Recv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Recv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBB.PFBBL6000.Recv_DtlR up0;
		
		
		// コンストラクタ
		protected Recv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBB.PFBBL6000.Recv_DtlR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBBL_GaService)PFBBL_GaService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Recv_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBB.PFBBL6000.Recv_DtlR createRecv_DtlR(){
			return mcframe.serverPFBB.PFBBL6000.Recv_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>budgetcode</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBB.PFBBL6000.Recv_DtlR
		 */
		public mcframe.serverPFBB.PFBBL6000.Recv_DtlR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBBL_GaService)PFBBL_GaService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}