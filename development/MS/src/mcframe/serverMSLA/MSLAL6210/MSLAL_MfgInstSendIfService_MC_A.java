package mcframe.serverMSLA.MSLAL6210;

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
 * "MSLAL_MfgInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_MfgInstSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL6210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_MfgInstSendIfService.MfgInstSendIf_Upd01 aMfgInstSendIf_Upd01;

	protected void initMfgInstSendIf_Upd01() {
		this.info = PDef.MS_MSLAL6210_MfgInstSendIf_Upd01_INFO;
		this.aMfgInstSendIf_Upd01 = ((MSLAL_MfgInstSendIfService)this).new MfgInstSendIf_Upd01();
	}

	public static MSLAL_MfgInstSendIfService.MfgInstSendIf_Upd01 crtMfgInstSendIf_Upd01() {
		MSLAL_MfgInstSendIfService lgc = new MSLAL_MfgInstSendIfService();
		lgc.initMfgInstSendIf_Upd01();
		return lgc.aMfgInstSendIf_Upd01;
	}

	protected void paramMfgInstSendIf_Upd01(MCParam p) {
		if (this.aMfgInstSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstSendIf_Upd01.up0());
		p.addUpBlock(aMfgInstSendIf_Upd01.up1());
		p.addUpBlock(aMfgInstSendIf_Upd01.up2());
		p.addUpBlock(aMfgInstSendIf_Upd01.up3());
	}

	protected void doMfgInstSendIf_Upd01() {
		aMfgInstSendIf_Upd01.call();
	};

	/**
	 * MfgInstSendIf_Upd01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR createMfgInstSendIf_Upd01_DtlOperR(){
		return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR.create();
	}

	/**
	 * MfgInstSendIf_Upd01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR> createMfgInstSendIf_Upd01_DtlOperL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR.class);
	}

	/**
	 * MfgInstSendIf_Upd01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR createMfgInstSendIf_Upd01_DtlInptR(){
		return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR.create();
	}

	/**
	 * MfgInstSendIf_Upd01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR> createMfgInstSendIf_Upd01_DtlInptL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR.class);
	}

	/**
	 * MfgInstSendIf_Upd01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR createMfgInstSendIf_Upd01_DtlYieldR(){
		return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR.create();
	}

	/**
	 * MfgInstSendIf_Upd01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR> createMfgInstSendIf_Upd01_DtlYieldL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR.class);
	}

	/**
	 * MfgInstSendIf_Upd01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR createMfgInstSendIf_Upd01_DtlWkR(){
		return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR.create();
	}

	/**
	 * MfgInstSendIf_Upd01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR> createMfgInstSendIf_Upd01_DtlWkL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の製造指図（工程指図・出来高予定・投入予定・工数予定）をＩＦテーブルに書き込む<br>
	 */
	abstract public class MfgInstSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR> up3;
		
		
		// コンストラクタ
		protected MfgInstSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR.class);
			up1 = MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR.class);
			up2 = MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR.class);

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
			invoke((MSLAL_MfgInstSendIfService)MSLAL_MfgInstSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstSendIf_Upd01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR createMfgInstSendIf_Upd01_DtlOperR(){
			return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR.create();
		}

		/**
		 * MfgInstSendIf_Upd01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR> createMfgInstSendIf_Upd01_DtlOperL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR.class);
		}

		/**
		 * MfgInstSendIf_Upd01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR createMfgInstSendIf_Upd01_DtlInptR(){
			return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR.create();
		}

		/**
		 * MfgInstSendIf_Upd01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR> createMfgInstSendIf_Upd01_DtlInptL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR.class);
		}

		/**
		 * MfgInstSendIf_Upd01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR createMfgInstSendIf_Upd01_DtlYieldR(){
			return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR.create();
		}

		/**
		 * MfgInstSendIf_Upd01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR> createMfgInstSendIf_Upd01_DtlYieldL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR.class);
		}

		/**
		 * MfgInstSendIf_Upd01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR createMfgInstSendIf_Upd01_DtlWkR(){
			return mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR.create();
		}

		/**
		 * MfgInstSendIf_Upd01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR> createMfgInstSendIf_Upd01_DtlWkL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlOperR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlInptR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6210.MfgInstSendIf_Upd01_DtlWkR> up3() {
			return up3;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_MfgInstSendIfService)MSLAL_MfgInstSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}