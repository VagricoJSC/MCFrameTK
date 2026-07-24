package mcframe.commonMAUC.MAUCC2010;

import mcframe.commonCore.container.*;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;

/**
 * MCRowMapperのコピー処理中に固定的に使う値を使用する値をセットできるRowMapperです
 * <P>
 * ヘッダ・明細をリストに渡す場合にヘッダのRowをセットすることを想定しています。
 * </P>
 * 
 * @param <D> コピー先のRow
 * @param <S> コピー元のRow
 * @param <W> 固定的に使う値
 */
public abstract class MAUCC_RowMapperWith_MC<D extends MCRow, S extends MCRow, W extends Object>
		extends FXUCC_RowMapperWith<D, S, W> {
}

