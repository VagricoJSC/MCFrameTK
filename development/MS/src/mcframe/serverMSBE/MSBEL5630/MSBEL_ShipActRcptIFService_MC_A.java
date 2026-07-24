package mcframe.serverMSBE.MSBEL5630;

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
 * "MSBEL_ShipActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipActRcptIFService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5630";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipActRcptIFService.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL5630_Chk01_INFO;
		this.aChk01 = ((MSBEL_ShipActRcptIFService)this).new Chk01();
	}

	public static MSBEL_ShipActRcptIFService.Chk01 crtChk01() {
		MSBEL_ShipActRcptIFService lgc = new MSBEL_ShipActRcptIFService();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addUpBlock(aChk01.up2());
		p.addUpBlock(aChk01.up3());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
		p.addDownBlock(aChk01.down3());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * ShipActIF_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR createShipActIF_CtrlR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
	}

	/**
	 * ShipActIF_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR createShipActIF_HdrR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.create();
	}

	/**
	 * ShipActIF_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> createShipActIF_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
	}

	/**
	 * ShipActIF_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR createShipActIF_DtlR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.create();
	}

	/**
	 * ShipActIF_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> createShipActIF_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
	}

	/**
	 * ShipActIF_CntrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR createShipActIF_CntrR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.create();
	}

	/**
	 * ShipActIF_CntrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> createShipActIF_CntrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
	}

	/**
	 * ShipActIF_DelDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR createShipActIF_DelDtlR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.create();
	}

	/**
	 * ShipActIF_DelDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> createShipActIF_DelDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
	}
	protected MSBEL_ShipActRcptIFService.ShipActIF_Upd01 aShipActIF_Upd01;

	protected void initShipActIF_Upd01() {
		this.info = PDef.MS_MSBEL5630_ShipActIF_Upd01_INFO;
		this.aShipActIF_Upd01 = ((MSBEL_ShipActRcptIFService)this).new ShipActIF_Upd01();
	}

	public static MSBEL_ShipActRcptIFService.ShipActIF_Upd01 crtShipActIF_Upd01() {
		MSBEL_ShipActRcptIFService lgc = new MSBEL_ShipActRcptIFService();
		lgc.initShipActIF_Upd01();
		return lgc.aShipActIF_Upd01;
	}

	protected void paramShipActIF_Upd01(MCParam p) {
		if (this.aShipActIF_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActIF_Upd01.up0());
		p.addUpBlock(aShipActIF_Upd01.up1());
		p.addUpBlock(aShipActIF_Upd01.up2());
		p.addUpBlock(aShipActIF_Upd01.up3());
		p.addDownBlock(aShipActIF_Upd01.down0());
		p.addDownBlock(aShipActIF_Upd01.down1());
	}

	protected void doShipActIF_Upd01() {
		aShipActIF_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷実績オペレーション用のチェック処理です。<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> down3;
		/** [ShipActIF_DelDtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> aShipActIF_DelDtl;
		
		/**
		 * 連携情報 SA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_InptChk01 （{@link #v0}）<br>
		 * 連携先 mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_InptChk02 （{@link #v1}）<br>
		 */
		public final String SA = "SA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_InptChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR&gt; （{@link #v0_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR&gt; （{@link #v0_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR&gt; （{@link #v0_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR&gt; （{@link #v0_up3}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR&gt; （{@link #v0_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR&gt; （{@link #v0_down1}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_InptChk01 v0;
		/**
		 * 連携オペレーション v1<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_InptChk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR&gt; （{@link #v1_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR&gt; （{@link #v1_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR&gt; （{@link #v1_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_InptChk02 v1;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> v0_up0;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> v0_up1;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> v0_up2;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> v0_up3;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> v1_up0;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> v1_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> v0_down0;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> v0_down1;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> v1_down0;
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
			down0 = mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
			aShipActIF_DelDtl = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.crtShipAct_InptChk01();
			v1 = mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.crtShipAct_InptChk02();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR>)v0.up(0);
			v0_up1 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR>)v0.up(1);
			v0_up2 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR>)v0.up(2);
			v0_up3 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR>)v0.up(3);
			v1_up0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR>)v1.up(0);
			v1_up1 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR>)v1.up(1);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR>)v0.down(0);
			v0_down1 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR>)v0.down(1);
			v1_down0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR>)v1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SA, v0);
			appendOpe(SA, v1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SA<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR&gt; （{@link #v0_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR&gt; （{@link #v0_up1}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR&gt; （{@link #v0_up2}）<br>
		 * aShipActIF_DelDtl => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR&gt; （{@link #v0_up3}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR&gt; （{@link #v1_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR&gt; （{@link #v1_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SA)) {
				up_SA(v0_up0, v0_up1, v0_up2, v0_up3, v1_up0, v1_up1, up1(), up2(), up3(), aShipActIF_DelDtl);
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR&gt;（{@link #v0_down0}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR&gt;（{@link #v0_down1}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR&gt;（{@link #v1_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SA)) {
				down_SA(down1(), down2(), v0_down0, v0_down1, v1_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipActRcptIFService)MSBEL_ShipActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * ShipActIF_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR createShipActIF_CtrlR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
		}

		/**
		 * ShipActIF_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR createShipActIF_HdrR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.create();
		}

		/**
		 * ShipActIF_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> createShipActIF_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
		}

		/**
		 * ShipActIF_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR createShipActIF_DtlR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.create();
		}

		/**
		 * ShipActIF_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> createShipActIF_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
		}

		/**
		 * ShipActIF_CntrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR createShipActIF_CntrR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.create();
		}

		/**
		 * ShipActIF_CntrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> createShipActIF_CntrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
		}

		/**
		 * ShipActIF_DelDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR createShipActIF_DelDtlR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.create();
		}

		/**
		 * ShipActIF_DelDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> createShipActIF_DelDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
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
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>row_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>row_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>io_act_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>non_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> down3() {
			return down3;
		}


		/**
		 * [ShipActIF_DelDtl]ブロックのコンテナaShipActIF_DelDtlLを返します。
		 *
		 * @return ShipActIF_DelDtlL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> ShipActIF_DelDtl() {
			return aShipActIF_DelDtl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActRcptIFService)MSBEL_ShipActRcptIFService_MC_A.this).info;
		}

		//-----------------------SA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SA(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> dest0_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> dest0_1, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> dest0_2, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> dest0_3, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> dest1_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> dest1_1, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> src_ShipActIF_Hdr, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> src_ShipActIF_Dtl, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> src_ShipActIF_Cntr, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> src_ShipActIF_DelDtl){
			up_SA_v0_0(dest0_0, src_ShipActIF_Hdr);
			up_SA_v0_1(dest0_1, src_ShipActIF_Dtl);
			up_SA_v0_2(dest0_2, src_ShipActIF_Cntr);
			up_SA_v0_3(dest0_3, src_ShipActIF_DelDtl);
			up_SA_v1_0(dest1_0, src_ShipActIF_Hdr);
			up_SA_v1_1(dest1_1, src_ShipActIF_Cntr);
		}
		
		/**
		 * 連携処理SA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_0() {
			MCRowMapper map = new Map_up_SA_v0_0();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("ship_inst_no", "ship_inst_no");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("rqst_dpt_cd", "rqst_dpt_cd");
				addColumnPathMap("rqst_usr_cd", "rqst_usr_cd");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("ship_dpt_cd", "ship_dpt_cd");
				addColumnPathMap("ship_usr_cd", "ship_usr_cd");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("ship_to_id_typ", "ship_to_id_typ");
				addColumnPathMap("ship_to_id_cd", "ship_to_id_cd");
				addColumnPathMap("ship_to_id_nm", "ship_to_id_nm");
				addColumnPathMap("ship_to_zip_cd", "ship_to_zip_cd");
				addColumnPathMap("ship_to_addr1", "ship_to_addr1");
				addColumnPathMap("ship_to_addr2", "ship_to_addr2");
				addColumnPathMap("ship_to_addr3", "ship_to_addr3");
				addColumnPathMap("ship_to_addr4", "ship_to_addr4");
				addColumnPathMap("ship_to_cntct_dpt", "ship_to_cntct_dpt");
				addColumnPathMap("ship_to_cntct_psn", "ship_to_cntct_psn");
				addColumnPathMap("ship_to_tel", "ship_to_tel");
				addColumnPathMap("ship_to_fax", "ship_to_fax");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("uplnd_flg", "uplnd_flg");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_slip_prnt_flg", "dlv_slip_prnt_flg");
				addColumnPathMap("ship_adv_prnt_flg", "ship_adv_prnt_flg");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_0(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_0(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_0();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v0の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_1() {
			MCRowMapper map = new Map_up_SA_v0_1();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("ship_loc_cd", "ship_loc_cd");
				addColumnPathMap("ship_str_ln_cd", "ship_str_ln_cd");
				addColumnPathMap("dlv_id_typ", "dlv_id_typ");
				addColumnPathMap("dlv_id_cd", "dlv_id_cd");
				addColumnPathMap("dlv_id_nm", "dlv_id_nm");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_str_ln_cd", "dlv_str_ln_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("rsn_cd", "rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_dlv_inst_no", "cst_dlv_inst_no");
				addColumnPathMap("cst_dlv_inst_d_no", "cst_dlv_inst_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("base_dlv_slip_no", "base_dlv_slip_no");
				addColumnPathMap("base_prov_act_no", "base_prov_act_no");
				addColumnPathMap("base_ac_dt", "base_ac_dt");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_d_rmrks", "intr_d_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("wms_flg", "wms_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_ship_act_no", "ext_ship_act_no");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_1(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_1(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_1();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v0の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_2() {
			MCRowMapper map = new Map_up_SA_v0_2();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_2(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_2(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_2();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v0の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v0_3() {
			MCRowMapper map = new Map_up_SA_v0_3();
			return map;
		}

		/**
		 * 連携処理SA_v0の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v0_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
			}
		}

		/**
		 * 連携処理SA_v0の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v0_3(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v0の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v0_3(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> src) {
			MCRowMapper _rm = createMap_up_SA_v0_3();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_Del_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v0_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v1_0() {
			MCRowMapper map = new Map_up_SA_v1_0();
			return map;
		}

		/**
		 * 連携処理SA_v1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("dlv_slip_prnt_flg", "dlv_slip_prnt_flg");
			}
		}

		/**
		 * 連携処理SA_v1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v1_0(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v1_0(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> src) {
			MCRowMapper _rm = createMap_up_SA_v1_0();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v1の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v1_1() {
			MCRowMapper map = new Map_up_SA_v1_1();
			return map;
		}

		/**
		 * 連携処理SA_v1の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v1_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
			}
		}

		/**
		 * 連携処理SA_v1の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v1_1(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR r_src) {
		}

		/**
		 * 連携処理SA_v1の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v1_1(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> src) {
			MCRowMapper _rm = createMap_up_SA_v1_1();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_CntrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v1_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SA専用down関連メソッド--------------------------
		/**
		 * 連携処理SA_v1の下りブロック0のJoinKey<p>
		 */
		protected MCJoinKey<MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR>> SA_v1_0_jk;

		/**
		 * オペレーショングループSAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SA(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> dest_ShipActIF_Hdr, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> dest_ShipActIF_Dtl, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> src0_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> src0_1, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> src1_0){
			down_SA_v0_0(dest_ShipActIF_Hdr, src0_0);
			down_SA_v0_1(dest_ShipActIF_Dtl, src0_1);
			join_SA_v1_0(dest_ShipActIF_Hdr, src1_0);
			down_SA_v1_0(dest_ShipActIF_Hdr);
		}

		/**
		 * 連携処理SA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v0_0() {
			MCRowMapper map = new Map_down_SA_v0_0();
			return map;
		}

		/**
		 * 連携処理SA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_dtl_peg_no", "peg_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("ship_inst_no", "ship_inst_no");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("rqst_dpt_cd", "rqst_dpt_cd");
				addColumnPathMap("rqst_usr_cd", "rqst_usr_cd");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_dpt_cd", "ship_dpt_cd");
				addColumnPathMap("ship_usr_cd", "ship_usr_cd");
				addColumnPathMap("ship_to_lg_grp_cd", "ship_to_lg_grp_cd");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("ship_to_id_typ", "ship_to_id_typ");
				addColumnPathMap("ship_to_id_cd", "ship_to_id_cd");
				addColumnPathMap("ship_to_id_nm", "ship_to_id_nm");
				addColumnPathMap("ship_to_zip_cd", "ship_to_zip_cd");
				addColumnPathMap("ship_to_addr1", "ship_to_addr1");
				addColumnPathMap("ship_to_addr2", "ship_to_addr2");
				addColumnPathMap("ship_to_addr3", "ship_to_addr3");
				addColumnPathMap("ship_to_addr4", "ship_to_addr4");
				addColumnPathMap("ship_to_cntct_dpt", "ship_to_cntct_dpt");
				addColumnPathMap("ship_to_cntct_psn", "ship_to_cntct_psn");
				addColumnPathMap("ship_to_tel", "ship_to_tel");
				addColumnPathMap("ship_to_fax", "ship_to_fax");
				addColumnPathMap("ship_to_sundry_flg", "ship_to_sundry_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("uplnd_flg", "uplnd_flg");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_slip_prnt_flg", "dlv_slip_prnt_flg");
				addColumnPathMap("ship_adv_prnt_flg", "ship_adv_prnt_flg");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理SA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SA_v0_0(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SA_v0_0(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR> src) {
			MCRowMapper _rm = createMap_down_SA_v0_0();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理SA_v0の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v0_1() {
			MCRowMapper map = new Map_down_SA_v0_1();
			return map;
		}

		/**
		 * 連携処理SA_v0の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v0_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("ship_loc_cd", "ship_loc_cd");
				addColumnPathMap("ship_str_ln_cd", "ship_str_ln_cd");
				addColumnPathMap("dlv_id_typ", "dlv_id_typ");
				addColumnPathMap("dlv_id_cd", "dlv_id_cd");
				addColumnPathMap("dlv_id_nm", "dlv_id_nm");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_str_ln_cd", "dlv_str_ln_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("rsn_cd", "rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_dpt_nm", "bd_dpt_nm");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_dlv_inst_no", "cst_dlv_inst_no");
				addColumnPathMap("cst_dlv_inst_d_no", "cst_dlv_inst_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("base_dlv_slip_no", "base_dlv_slip_no");
				addColumnPathMap("base_prov_act_no", "base_prov_act_no");
				addColumnPathMap("base_ac_dt", "base_ac_dt");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_d_rmrks", "intr_d_rmrks");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("non_upd_flg", "non_upd_flg");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("wms_flg", "wms_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_ship_act_no", "ext_ship_act_no");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理SA_v0の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SA_v0_1(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v0の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SA_v0_1(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_SA_v0_1();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SA_v0_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理SA_v1の下りブロック0のJoinKeyを作成する。<p>
		 */
		protected void join_SA_v1_0(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR> src){
			String[] dest_cols ={
				};
			String[] src_cols = {
				};
			SA_v1_0_jk = dest.join(dest_cols, src, src_cols);
		}

		/**
		 * 連携処理SA_v1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v1_0() {
			MCRowMapper map = new Map_down_SA_v1_0();
			return map;
		}

		/**
		 * 連携処理SA_v1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_dtl_peg_no", "peg_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("dlv_slip_prnt_flg", "dlv_slip_prnt_flg");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理SA_v1の下りブロック0のJoin処理を行う。<p>
		 *
		 * @param dest コピー先のList
		 */
		protected void down_SA_v1_0(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> dest){
			if(SA_v1_0_jk == null) return;
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_dest : dest){
				mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR jRow = (mcframe.serverMSBE.MSBEL5540.ShipAct_InptChk02_HdrR)r_dest.getJoinedRow(SA_v1_0_jk);
				if(jRow == null) continue;
				r_dest.data_crud_typ(jRow.data_crud_typ());
				r_dest.hdr_dtl_peg_no(jRow.peg_no());
				r_dest.ship_act_no(jRow.ship_act_no());
				r_dest.can_ac_dt(jRow.can_ac_dt());
				r_dest.dlv_slip_prnt_flg(jRow.dlv_slip_prnt_flg());
				r_dest.err_flg(jRow.err_flg());
			}
		}
	}
	/**
	 * ShipActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから出荷実績の登録、更新、取消を行います。<br>
	 */
	abstract public class ShipActIF_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActIF_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> down1;
		
		/**
		 * 連携情報 SA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Upd01 （{@link #v2}）<br>
		 */
		public final String SA = "SA";

		/**
		 * 連携オペレーション v2<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Upd01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL5540.ShipAct_CndR （{@link #v2_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v2_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt; （{@link #v2_up2}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v2_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt; （{@link #v2_down1}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.ShipAct_Upd01 v2;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL5540.ShipAct_CndR v2_up0;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> v2_up1;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> v2_up2;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> v2_down0;
		public final MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> v2_down1;
		
		// コンストラクタ
		protected ShipActIF_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);

			// 連携オペレーションの初期化
			v2 = mcframe.serverMSBE.MSBEL5540.MSBEL_ShipActService.crtShipAct_Upd01();
			
			// 連携オペレーションのコンテナ取得
			v2_up0 = (mcframe.serverMSBE.MSBEL5540.ShipAct_CndR)v2.up(2);
			v2_up1 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR>)v2.up(0);
			v2_up2 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR>)v2.up(1);
			v2_down0 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR>)v2.down(0);
			v2_down1 = (MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR>)v2.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(SA, v2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SA<br>
		 * up0() => mcframe.serverMSBE.MSBEL5540.ShipAct_CndR （{@link #v2_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt; （{@link #v2_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt; （{@link #v2_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SA)) {
				up_SA(v2_up0, v2_up1, v2_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR&gt;（{@link #v2_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR&gt;（{@link #v2_down1}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SA)) {
				down_SA(down0(), down1(), v2_down0, v2_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipActRcptIFService)MSBEL_ShipActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipActIF_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR createShipActIF_CtrlR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
		}

		/**
		 * ShipActIF_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR createShipActIF_HdrR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.create();
		}

		/**
		 * ShipActIF_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> createShipActIF_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
		}

		/**
		 * ShipActIF_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR createShipActIF_DtlR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.create();
		}

		/**
		 * ShipActIF_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> createShipActIF_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
		}

		/**
		 * ShipActIF_CntrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR createShipActIF_CntrR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.create();
		}

		/**
		 * ShipActIF_CntrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> createShipActIF_CntrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
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
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_ship_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnted_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipActRcptIFService)MSBEL_ShipActRcptIFService_MC_A.this).info;
		}

		//-----------------------SA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SA(mcframe.serverMSBE.MSBEL5540.ShipAct_CndR dest0_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> dest0_1, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> dest0_2, mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR src_ShipActIF_Ctrl, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> src_ShipActIF_Hdr, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> src_ShipActIF_Dtl){
			up_SA_v2_0(dest0_0, src_ShipActIF_Ctrl);
			up_SA_v2_1(dest0_1, src_ShipActIF_Hdr);
			up_SA_v2_2(dest0_2, src_ShipActIF_Dtl);
		}
		
		/**
		 * 連携処理SA_v2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v2_0() {
			MCRowMapper map = new Map_up_SA_v2_0();
			return map;
		}

		/**
		 * 連携処理SA_v2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bndl_prnt_flg", "bndl_prnt_flg");
			}
		}

		/**
		 * 連携処理SA_v2の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SA_v2_0(mcframe.serverMSBE.MSBEL5540.ShipAct_CndR dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR src) {
			createMap_up_SA_v2_0().copy(dest, src);
		}
		
		/**
		 * 連携処理SA_v2の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v2_1() {
			MCRowMapper map = new Map_up_SA_v2_1();
			return map;
		}

		/**
		 * 連携処理SA_v2の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v2_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("ship_inst_no", "ship_inst_no");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("rqst_dpt_cd", "rqst_dpt_cd");
				addColumnPathMap("rqst_usr_cd", "rqst_usr_cd");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_dpt_cd", "ship_dpt_cd");
				addColumnPathMap("ship_usr_cd", "ship_usr_cd");
				addColumnPathMap("ship_to_lg_grp_cd", "ship_to_lg_grp_cd");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("ship_to_id_typ", "ship_to_id_typ");
				addColumnPathMap("ship_to_id_cd", "ship_to_id_cd");
				addColumnPathMap("ship_to_id_nm", "ship_to_id_nm");
				addColumnPathMap("ship_to_zip_cd", "ship_to_zip_cd");
				addColumnPathMap("ship_to_addr1", "ship_to_addr1");
				addColumnPathMap("ship_to_addr2", "ship_to_addr2");
				addColumnPathMap("ship_to_addr3", "ship_to_addr3");
				addColumnPathMap("ship_to_addr4", "ship_to_addr4");
				addColumnPathMap("ship_to_cntct_dpt", "ship_to_cntct_dpt");
				addColumnPathMap("ship_to_cntct_psn", "ship_to_cntct_psn");
				addColumnPathMap("ship_to_tel", "ship_to_tel");
				addColumnPathMap("ship_to_fax", "ship_to_fax");
				addColumnPathMap("ship_to_sundry_flg", "ship_to_sundry_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("uplnd_flg", "uplnd_flg");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_slip_prnt_flg", "dlv_slip_prnt_flg");
				addColumnPathMap("ship_adv_prnt_flg", "ship_adv_prnt_flg");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
				addColumnPathMap("dlv_slip_flg", "dlv_slip_flg");
				addColumnPathMap("io_act_flg", "io_act_flg");
				addColumnPathMap("sls_act_flg", "sls_act_flg");
			}
		}

		/**
		 * 連携処理SA_v2の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v2_1(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v2の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v2_1(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> src) {
			MCRowMapper _rm = createMap_up_SA_v2_1();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v2_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SA_v2の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SA_v2_2() {
			MCRowMapper map = new Map_up_SA_v2_2();
			return map;
		}

		/**
		 * 連携処理SA_v2の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_SA_v2_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("ship_loc_cd", "ship_loc_cd");
				addColumnPathMap("ship_str_ln_cd", "ship_str_ln_cd");
				addColumnPathMap("dlv_id_typ", "dlv_id_typ");
				addColumnPathMap("dlv_id_cd", "dlv_id_cd");
				addColumnPathMap("dlv_id_nm", "dlv_id_nm");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_str_ln_cd", "dlv_str_ln_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("rsn_cd", "rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_dpt_nm", "bd_dpt_nm");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_dlv_inst_no", "cst_dlv_inst_no");
				addColumnPathMap("cst_dlv_inst_d_no", "cst_dlv_inst_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("base_dlv_slip_no", "base_dlv_slip_no");
				addColumnPathMap("base_prov_act_no", "base_prov_act_no");
				addColumnPathMap("base_ac_dt", "base_ac_dt");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_d_rmrks", "intr_d_rmrks");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("non_upd_flg", "non_upd_flg");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("wms_flg", "wms_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_ship_act_no", "ext_ship_act_no");
			}
		}

		/**
		 * 連携処理SA_v2の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SA_v2_2(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_dest, mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v2の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SA_v2_2(MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> src) {
			MCRowMapper _rm = createMap_up_SA_v2_2();
			for(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SA_v2_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SA(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> dest_ShipActIF_Hdr, MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> dest_ShipActIF_Dtl, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> src0_0, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> src0_1){
			down_SA_v2_0(dest_ShipActIF_Hdr, src0_0);
			down_SA_v2_1(dest_ShipActIF_Dtl, src0_1);
		}

		/**
		 * 連携処理SA_v2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v2_0() {
			MCRowMapper map = new Map_down_SA_v2_0();
			return map;
		}

		/**
		 * 連携処理SA_v2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_dtl_peg_no", "peg_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("ship_act_rev", "ship_act_rev");
				addColumnPathMap("dlv_slip_prnted_flg", "dlv_slip_prnted_flg");
				addColumnPathMap("ship_adv_prnted_flg", "ship_adv_prnted_flg");
			}
		}

		/**
		 * 連携処理SA_v2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SA_v2_0(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_src) {
		}

		/**
		 * 連携処理SA_v2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SA_v2_0(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR> src) {
			MCRowMapper _rm = createMap_down_SA_v2_0();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_HdrR r_src : src){
				mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SA_v2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理SA_v2の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SA_v2_1() {
			MCRowMapper map = new Map_down_SA_v2_1();
			return map;
		}

		/**
		 * 連携処理SA_v2の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_SA_v2_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_dtl_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_dpt_nm", "bd_dpt_nm");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("pr_sts_typ", "pr_sts_typ");
				addColumnPathMap("pr_sts_typ_nm", "pr_sts_typ_nm");
			}
		}

		/**
		 * 連携処理SA_v2の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SA_v2_1(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_dest, mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_src) {
		}

		/**
		 * 連携処理SA_v2の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SA_v2_1(MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR> src) {
			MCRowMapper _rm = createMap_down_SA_v2_1();
			for(mcframe.serverMSBE.MSBEL5540.ShipAct_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SA_v2_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}