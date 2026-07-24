package mcframe.serverMAUC.MAUCL5010;

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
 * "MAUCL_PushNtcRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUCL_PushNtcRegService_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUCL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MAUCL_PushNtcRegService.PushNtc_Upd01 aPushNtc_Upd01;

	protected void initPushNtc_Upd01() {
		this.info = PDef.MA_MAUCL5010_PushNtc_Upd01_INFO;
		this.aPushNtc_Upd01 = ((MAUCL_PushNtcRegService)this).new PushNtc_Upd01();
	}

	public static MAUCL_PushNtcRegService.PushNtc_Upd01 crtPushNtc_Upd01() {
		MAUCL_PushNtcRegService lgc = new MAUCL_PushNtcRegService();
		lgc.initPushNtc_Upd01();
		return lgc.aPushNtc_Upd01;
	}

	protected void paramPushNtc_Upd01(MCParam p) {
		if (this.aPushNtc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPushNtc_Upd01.up0());
		p.addUpBlock(aPushNtc_Upd01.up1());
		p.addUpBlock(aPushNtc_Upd01.up2());
		p.addUpBlock(aPushNtc_Upd01.up3());
	}

	protected void doPushNtc_Upd01() {
		aPushNtc_Upd01.call();
	};

	/**
	 * PushNtc_Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R createPushNtc_Upd01_Dtl1R(){
		return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R.create();
	}

	/**
	 * PushNtc_Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R> createPushNtc_Upd01_Dtl1L(){
		return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R.class);
	}

	/**
	 * PushNtc_Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R createPushNtc_Upd01_Dtl2R(){
		return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R.create();
	}

	/**
	 * PushNtc_Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R> createPushNtc_Upd01_Dtl2L(){
		return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R.class);
	}

	/**
	 * PushNtc_Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R createPushNtc_Upd01_Dtl3R(){
		return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R.create();
	}

	/**
	 * PushNtc_Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R> createPushNtc_Upd01_Dtl3L(){
		return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R.class);
	}

	/**
	 * PushNtc_Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R createPushNtc_Upd01_Dtl4R(){
		return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R.create();
	}

	/**
	 * PushNtc_Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R> createPushNtc_Upd01_Dtl4L(){
		return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R.class);
	}

	/**
	 * PushNtc_Upd01_Wk1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R createPushNtc_Upd01_Wk1R(){
		return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R.create();
	}

	/**
	 * PushNtc_Upd01_Wk1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R> createPushNtc_Upd01_Wk1L(){
		return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R.class);
	}

	/**
	 * PushNtc_Upd01_Wk2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R createPushNtc_Upd01_Wk2R(){
		return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R.create();
	}

	/**
	 * PushNtc_Upd01_Wk2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R> createPushNtc_Upd01_Wk2L(){
		return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PushNtc_Upd01オペレーション.<p>
	 *
	 * プッシュ通知の内容を登録します。<br>
	 */
	abstract public class PushNtc_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PushNtc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R> up3;
		/** [PushNtc_Upd01_Wk1]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R> aPushNtc_Upd01_Wk1;
		/** [PushNtc_Upd01_Wk2]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R> aPushNtc_Upd01_Wk2;
		
		
		// コンストラクタ
		protected PushNtc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R.class);
			up1 = MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R.class);
			up2 = MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R.class);
			up3 = MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R.class);
			aPushNtc_Upd01_Wk1 = MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R.class);
			aPushNtc_Upd01_Wk2 = MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R.class);

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
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_PushNtcRegService)MAUCL_PushNtcRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PushNtc_Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R createPushNtc_Upd01_Dtl1R(){
			return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R.create();
		}

		/**
		 * PushNtc_Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R> createPushNtc_Upd01_Dtl1L(){
			return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R.class);
		}

		/**
		 * PushNtc_Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R createPushNtc_Upd01_Dtl2R(){
			return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R.create();
		}

		/**
		 * PushNtc_Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R> createPushNtc_Upd01_Dtl2L(){
			return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R.class);
		}

		/**
		 * PushNtc_Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R createPushNtc_Upd01_Dtl3R(){
			return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R.create();
		}

		/**
		 * PushNtc_Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R> createPushNtc_Upd01_Dtl3L(){
			return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R.class);
		}

		/**
		 * PushNtc_Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R createPushNtc_Upd01_Dtl4R(){
			return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R.create();
		}

		/**
		 * PushNtc_Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R> createPushNtc_Upd01_Dtl4L(){
			return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R.class);
		}

		/**
		 * PushNtc_Upd01_Wk1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R createPushNtc_Upd01_Wk1R(){
			return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R.create();
		}

		/**
		 * PushNtc_Upd01_Wk1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R> createPushNtc_Upd01_Wk1L(){
			return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R.class);
		}

		/**
		 * PushNtc_Upd01_Wk2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R createPushNtc_Upd01_Wk2R(){
			return mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R.create();
		}

		/**
		 * PushNtc_Upd01_Wk2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R> createPushNtc_Upd01_Wk2L(){
			return MCList.create(mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>msg_id</td></tr>
		 * 	<tr><td><br></td><td>src_module_id</td></tr>
		 * 	<tr><td><br></td><td>src_logic_id</td></tr>
		 * 	<tr><td><br></td><td>src_operation_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_usr_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl2R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>bind_val</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl3R> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_val</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Dtl4R> up3() {
			return up3;
		}



		/**
		 * [PushNtc_Upd01_Wk1]ブロックのコンテナaPushNtc_Upd01_Wk1Lを返します。
		 *
		 * @return PushNtc_Upd01_Wk1L
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk1R> PushNtc_Upd01_Wk1() {
			return aPushNtc_Upd01_Wk1;
		}

		/**
		 * [PushNtc_Upd01_Wk2]ブロックのコンテナaPushNtc_Upd01_Wk2Lを返します。
		 *
		 * @return PushNtc_Upd01_Wk2L
		 */
		public MCList<mcframe.serverMAUC.MAUCL5010.PushNtc_Upd01_Wk2R> PushNtc_Upd01_Wk2() {
			return aPushNtc_Upd01_Wk2;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_PushNtcRegService)MAUCL_PushNtcRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}