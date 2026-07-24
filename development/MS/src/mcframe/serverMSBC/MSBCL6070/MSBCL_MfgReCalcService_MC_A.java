package mcframe.serverMSBC.MSBCL6070;

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
 * "MSBCL_MfgReCalcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgReCalcService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL6070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgReCalcService.MfgReCalc_Sprt02 aMfgReCalc_Sprt02;

	protected void initMfgReCalc_Sprt02() {
		this.info = PDef.MS_MSBCL6070_MfgReCalc_Sprt02_INFO;
		this.aMfgReCalc_Sprt02 = ((MSBCL_MfgReCalcService)this).new MfgReCalc_Sprt02();
	}

	public static MSBCL_MfgReCalcService.MfgReCalc_Sprt02 crtMfgReCalc_Sprt02() {
		MSBCL_MfgReCalcService lgc = new MSBCL_MfgReCalcService();
		lgc.initMfgReCalc_Sprt02();
		return lgc.aMfgReCalc_Sprt02;
	}

	protected void paramMfgReCalc_Sprt02(MCParam p) {
		if (this.aMfgReCalc_Sprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgReCalc_Sprt02.up0());
		p.addUpBlock(aMfgReCalc_Sprt02.up1());
		p.addUpBlock(aMfgReCalc_Sprt02.up2());
		p.addUpBlock(aMfgReCalc_Sprt02.up3());
		p.addUpBlock(aMfgReCalc_Sprt02.up4());
		p.addDownBlock(aMfgReCalc_Sprt02.down0());
		p.addDownBlock(aMfgReCalc_Sprt02.down1());
	}

	protected void doMfgReCalc_Sprt02() {
		aMfgReCalc_Sprt02.call();
	};

	/**
	 * MfgReCalc_Sprt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR createMfgReCalc_Sprt02_HdrR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
	}

	/**
	 * MfgReCalc_Sprt02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR> createMfgReCalc_Sprt02_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.class);
	}

	/**
	 * MfgReCalc_Sprt02_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR createMfgReCalc_Sprt02_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR.create();
	}

	/**
	 * MfgReCalc_Sprt02_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> createMfgReCalc_Sprt02_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR.class);
	}

	/**
	 * MfgReCalc_Sprt02_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR createMfgReCalc_Sprt02_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR.create();
	}

	/**
	 * MfgReCalc_Sprt02_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> createMfgReCalc_Sprt02_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR.class);
	}

	/**
	 * MfgReCalc_Sprt02_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR createMfgReCalc_Sprt02_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR.create();
	}

	/**
	 * MfgReCalc_Sprt02_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> createMfgReCalc_Sprt02_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR.class);
	}

	/**
	 * MfgReCalc_Sprt02_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR createMfgReCalc_Sprt02_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR.create();
	}

	/**
	 * MfgReCalc_Sprt02_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> createMfgReCalc_Sprt02_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR.class);
	}
	protected MSBCL_MfgReCalcService.MfgReCalc_Sprt03 aMfgReCalc_Sprt03;

	protected void initMfgReCalc_Sprt03() {
		this.info = PDef.MS_MSBCL6070_MfgReCalc_Sprt03_INFO;
		this.aMfgReCalc_Sprt03 = ((MSBCL_MfgReCalcService)this).new MfgReCalc_Sprt03();
	}

	public static MSBCL_MfgReCalcService.MfgReCalc_Sprt03 crtMfgReCalc_Sprt03() {
		MSBCL_MfgReCalcService lgc = new MSBCL_MfgReCalcService();
		lgc.initMfgReCalc_Sprt03();
		return lgc.aMfgReCalc_Sprt03;
	}

	protected void paramMfgReCalc_Sprt03(MCParam p) {
		if (this.aMfgReCalc_Sprt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgReCalc_Sprt03.up0());
		p.addUpBlock(aMfgReCalc_Sprt03.up1());
		p.addUpBlock(aMfgReCalc_Sprt03.up2());
		p.addUpBlock(aMfgReCalc_Sprt03.up3());
		p.addUpBlock(aMfgReCalc_Sprt03.up4());
		p.addUpBlock(aMfgReCalc_Sprt03.up5());
		p.addDownBlock(aMfgReCalc_Sprt03.down0());
		p.addDownBlock(aMfgReCalc_Sprt03.down1());
		p.addDownBlock(aMfgReCalc_Sprt03.down2());
		p.addDownBlock(aMfgReCalc_Sprt03.down3());
		p.addDownBlock(aMfgReCalc_Sprt03.down4());
	}

	protected void doMfgReCalc_Sprt03() {
		aMfgReCalc_Sprt03.call();
	};

	/**
	 * MfgReCalc_Sprt03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR createMfgReCalc_Sprt03_HdrR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.create();
	}

	/**
	 * MfgReCalc_Sprt03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR> createMfgReCalc_Sprt03_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.class);
	}

	/**
	 * MfgReCalc_Sprt03_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR createMfgReCalc_Sprt03_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR.create();
	}

	/**
	 * MfgReCalc_Sprt03_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> createMfgReCalc_Sprt03_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR.class);
	}

	/**
	 * MfgReCalc_Sprt03_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR createMfgReCalc_Sprt03_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.create();
	}

	/**
	 * MfgReCalc_Sprt03_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> createMfgReCalc_Sprt03_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
	}

	/**
	 * MfgReCalc_Sprt03_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR createMfgReCalc_Sprt03_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.create();
	}

	/**
	 * MfgReCalc_Sprt03_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> createMfgReCalc_Sprt03_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
	}

	/**
	 * MfgReCalc_Sprt03_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR createMfgReCalc_Sprt03_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR.create();
	}

	/**
	 * MfgReCalc_Sprt03_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> createMfgReCalc_Sprt03_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR.class);
	}

	/**
	 * MfgReCalc_Sprt03_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR createMfgReCalc_Sprt03_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR.create();
	}

	/**
	 * MfgReCalc_Sprt03_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> createMfgReCalc_Sprt03_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgReCalc_Sprt02オペレーション.<p>
	 *
	 * 工程単位実績数または出来高実績数から、投入・工数の数量を再計算します。<br>
	 */
	abstract public class MfgReCalc_Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgReCalc_Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> down1;
		
		
		// コンストラクタ
		protected MfgReCalc_Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR.class);

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
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgReCalcService)MSBCL_MfgReCalcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * MfgReCalc_Sprt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR createMfgReCalc_Sprt02_HdrR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
		}

		/**
		 * MfgReCalc_Sprt02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR> createMfgReCalc_Sprt02_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.class);
		}

		/**
		 * MfgReCalc_Sprt02_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR createMfgReCalc_Sprt02_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR.create();
		}

		/**
		 * MfgReCalc_Sprt02_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> createMfgReCalc_Sprt02_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR.class);
		}

		/**
		 * MfgReCalc_Sprt02_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR createMfgReCalc_Sprt02_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR.create();
		}

		/**
		 * MfgReCalc_Sprt02_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> createMfgReCalc_Sprt02_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR.class);
		}

		/**
		 * MfgReCalc_Sprt02_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR createMfgReCalc_Sprt02_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR.create();
		}

		/**
		 * MfgReCalc_Sprt02_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> createMfgReCalc_Sprt02_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR.class);
		}

		/**
		 * MfgReCalc_Sprt02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR createMfgReCalc_Sprt02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR.create();
		}

		/**
		 * MfgReCalc_Sprt02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> createMfgReCalc_Sprt02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_purc_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>st_cost</td></tr>
		 * 	<tr><td><br></td><td>act_cost</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>st_fxd_cost</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>act_cost</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgReCalcService)MSBCL_MfgReCalcService_MC_A.this).info;
		}


	}
	/**
	 * MfgReCalc_Sprt03オペレーション.<p>
	 *
	 * 製造指図数に対する着手数から、工程、出来高・投入・副産品・工数の数量を再計算します。<br>
	 */
	abstract public class MfgReCalc_Sprt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgReCalc_Sprt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> up5;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> down4;
		
		
		// コンストラクタ
		protected MfgReCalc_Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR.class);

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
			if (i == 4) return up4();
			if (i == 5) return up5();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgReCalcService)MSBCL_MfgReCalcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * MfgReCalc_Sprt03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR createMfgReCalc_Sprt03_HdrR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.create();
		}

		/**
		 * MfgReCalc_Sprt03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR> createMfgReCalc_Sprt03_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.class);
		}

		/**
		 * MfgReCalc_Sprt03_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR createMfgReCalc_Sprt03_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR.create();
		}

		/**
		 * MfgReCalc_Sprt03_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> createMfgReCalc_Sprt03_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR.class);
		}

		/**
		 * MfgReCalc_Sprt03_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR createMfgReCalc_Sprt03_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.create();
		}

		/**
		 * MfgReCalc_Sprt03_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> createMfgReCalc_Sprt03_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
		}

		/**
		 * MfgReCalc_Sprt03_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR createMfgReCalc_Sprt03_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.create();
		}

		/**
		 * MfgReCalc_Sprt03_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> createMfgReCalc_Sprt03_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR.class);
		}

		/**
		 * MfgReCalc_Sprt03_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR createMfgReCalc_Sprt03_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR.create();
		}

		/**
		 * MfgReCalc_Sprt03_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> createMfgReCalc_Sprt03_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR.class);
		}

		/**
		 * MfgReCalc_Sprt03_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR createMfgReCalc_Sprt03_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR.create();
		}

		/**
		 * MfgReCalc_Sprt03_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> createMfgReCalc_Sprt03_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_qty</td></tr>
		 * 	<tr><td><br></td><td>is_src_mfg_inst_srv_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> up5() {
			return up5;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_st_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_st_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_st_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_st_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>st_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>st_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>st_sum_wk_cost</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgReCalcService)MSBCL_MfgReCalcService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}